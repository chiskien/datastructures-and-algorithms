package chiskien.javacore.chapter8_threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dance {
    private Lock lock = new ReentrantLock();

    public void lockUp() {
        System.out.println("adasdasdas");
        if (lock.tryLock()) {
            lock.lock();
            System.out.println("Locked!");
            lock.unlock();
        }
    }

    public static void main(String[] args) throws Exception {
        var gate = new Dance();
        for (int i = 0; i < 5; i++) {
            new Thread(gate::lockUp).start();
        }
    }
}
