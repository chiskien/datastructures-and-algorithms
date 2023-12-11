package chiskien.javacore.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyThreads implements Runnable {

    public String name;
    public int index;

    public MyThreads(int i) {
        this.index = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Running " + name + " " + i);
        }
    }

    public void doSomethingParallel() {
        final int NUM_THREADS = 20; //20 threads
        final ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<Integer>> futures = new ArrayList<>(NUM_THREADS);
        for (int i = 0; i < NUM_THREADS; i++) {
            Future<Integer> f = (Future<Integer>) pool.submit(new MyThreads(i));
        }
        pool.shutdown();
    }
}
