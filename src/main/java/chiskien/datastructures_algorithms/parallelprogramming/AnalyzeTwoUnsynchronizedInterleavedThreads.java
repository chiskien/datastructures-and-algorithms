package chiskien.datastructures_algorithms.parallelprogramming;

public class AnalyzeTwoUnsynchronizedInterleavedThreads {

    //Thread T1 and T2 each increment an integer variable N times.
    //This program yields nondeterministic results.
    //Usually, it prints 2N, but sometimes it prints a smaller value

    public static class IncrementThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < TwoThreadsIncrementDriver.N; i++) {
                System.out.println(i);
            }
        }
    }

    public static class TwoThreadsIncrementDriver {
        public static int N;
        public static int counter;

        public static void main(String[] args) throws Exception {
            if (args.length > 0) {
                N = Integer.parseInt(args[0]);
            } else {
                N = 100;
            }
            Thread t1 = new Thread(new IncrementThread());
            Thread t2 = new Thread(new IncrementThread());
            t1.start();
            t2.start();
            t1.join();
            t2.join();

        }
    }

}
