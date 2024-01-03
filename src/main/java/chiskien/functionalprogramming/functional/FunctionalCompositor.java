package chiskien.functionalprogramming.functional;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalCompositor {
    public static void main(String[] args) {
        FunctionalCompositor functionalCompositor = new FunctionalCompositor();
        functionalCompositor.demo();
    }
    public static class Compositor {
        private Compositor() {
        }

        public static <T, R> Supplier<R> compose(Supplier<T> before,
                                                 Function<T, R> function) {
            Objects.requireNonNull(before);
            Objects.requireNonNull(function);
            return () -> {
                T result = before.get();
                return function.apply(result);
            };
        }

        public static <T, R> Consumer<T> compose(Function<T, R> function,
                                                 Consumer<R> after) {
            Objects.requireNonNull(function);
            Objects.requireNonNull(after);
            return (t) -> {
                R result = function.apply(t);
                after.accept(result);
            };
        }
    }

    public void demo() {
        Function<String, String> removeLowerCaseA = s -> s.replace("a", "");
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> stringOperations = removeLowerCaseA.andThen(toUpperCase);

        //composed string functions and consumer
        Consumer<String> task = Compositor.compose(stringOperations, System.out::println);

        task.accept("abbbbccaaaaaa");

    }
}
