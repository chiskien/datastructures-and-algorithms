package chiskien.effectivejava.chapter10_concurrency.item78;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Synchro {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(array);
        Callable<AtomicIntegerArray> callable = () -> {
            System.out.println("Callable");
            return atomicIntegerArray;
        };
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            for (int i = 0; i < 1000; i++) {
                Future<AtomicIntegerArray> future = executorService.submit(callable);
                AtomicIntegerArray arr = future.get();
                System.out.println(arr);
            }
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
