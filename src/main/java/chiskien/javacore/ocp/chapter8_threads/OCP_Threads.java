package chiskien.javacore.ocp.chapter8_threads;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class OCP_Threads {


    public static void main(String[] args) {
        OCP_Threads ocpThreads = new OCP_Threads();
        ocpThreads.ocp17_8_4();
    }

    //What is the output of the following code snippet?
    //XXXXXXXXXXDone!
    //Done!XXXXXXXXXX
    //The code does not compile.
    //The code hangs indefinitely at runtime.
    //The code throws an exception at runtime.
    //The output cannot be determined ahead of time.
    public void ocp17_8_2() {
        Callable<Integer> callable = () -> {
            System.out.print("X");
            return 10;
        };
        try (ExecutorService s = Executors.newFixedThreadPool(3)) {
            //create a thread pool with 1 thread
            for (int i = 0; i < 10; i++) {
                Future<Integer> future = s.submit(callable);
                Integer i1 = future.get();
                System.out.println(i1);
            }
            s.shutdown();
            System.out.print("Done");
        } catch (ExecutionException | InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    public void ocp17_8_4() {
        AtomicBoolean coin = new AtomicBoolean(false);
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 6; i++) {
                executorService.execute(() -> coin.getAndSet(!coin.get()));
            }
            executorService.shutdown();
            Thread.sleep(2000);
            System.out.println(coin.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void ocp17_8_5() {
        //Which of the following is a recommended way to define an asynchronous task?
        //A. Create a Callable expression and pass it to an instance of an Executor.
        //B. Create a class that extends Thread and override the start() method.
        //C. Create a Runnable lambda expression and pass it to a Thread constructor.
        //D. Create an anonymous Runnable class that overrides the begin() method.
        //E. All of the above.
        Callable<String> callable = () -> {
            String result = "Callable";
            System.out.println(result);
            return result;
        };
    }
}
