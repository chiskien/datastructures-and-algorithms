package chiskien.javacore.threads;

import java.util.concurrent.*;

/**
 * This is a custom Threads to understand how Concurrency in Java works
 *
 * @author chisk
 * @version 21
 * @since 2023
 */

public class MyThreads implements Runnable {

    public String name;
    public volatile int index;

    public MyThreads(int i) {
        this.index = i;
    }

    @Override
    public strictfp void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Running " + name + " " + i);
        }
    }

    public void theadPool() {
        Callable<String> callable = () -> {
            System.out.println("Callable");
            return "Callable";
        };
        //newFixedThreadPool: A fixed-size thread pool create threads as tasks are submitted, up to the maximum pool size, and then attempts to keep the pool size constant
        try (ExecutorService executorService = Executors.newFixedThreadPool(200)) {
            executorService.submit(callable);
            executorService.shutdown();
        }

        //newCachedThreadPool: A cached thread pool has more flexibility to reap idle threads when the current size of the pool exceeds the demand for processing, and to add new threads when demand increases, but places no bounds on the size of the pool
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 20; i++) {
                Future<String> future = executorService.submit(callable);
                future.get();
            }
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        //newSingleThreadExecutor: A single-threaded executor creates a single worker thread to process tasks, replacing it if it dies unexpectedly. Tasks are guaranteed to be processed sequentially according to the order imposed by the task queue (FIFO, LIFO, priority order)
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 20; i++) {
                Future<String> future = executorService.submit(callable);
                future.get();
            }

            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
