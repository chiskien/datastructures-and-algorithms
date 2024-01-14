package chiskien.functionalprogramming.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class UserService {

    private final ConcurrentHashMap<Long, User> userConcurrentHashMap;

    public UserService() {
        this.userConcurrentHashMap = new ConcurrentHashMap<>();
    }

    public Mono<User> getFavorite(Long userId) {
        return Mono.just(userConcurrentHashMap.get(userId));
    }

    public Flux<User> transformUserToBitch(Flux<User> source) {
        return source.concatWith(Mono.just(new User("Bitch")));
    }
}
