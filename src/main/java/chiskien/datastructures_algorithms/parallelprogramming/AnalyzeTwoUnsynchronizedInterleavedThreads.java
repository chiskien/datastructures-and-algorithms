package chiskien.datastructures_algorithms.parallelprogramming;

class AnalyzeTwoUnsynchronizedInterleavedThreads {
    private AnalyzeTwoUnsynchronizedInterleavedThreads() {

    }

    //Thread T1 and T2 each increment an integer variable numberOfThreads times.
    //This program yields nondeterministic results.
    //Usually, it prints 2N, but sometimes it prints a smaller value

    static class IncrementThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < TwoThreadsIncrementDriver.numberOfThreads; i++) {
                System.out.println(i);
            }
        }
    }

    static class TwoThreadsIncrementDriver {
        static int numberOfThreads;
        static int counter;

        public static void main(String[] args) throws Exception {
            if (args.length > 0) {
                numberOfThreads = Integer.parseInt(args[0]);
            } else {
                numberOfThreads = 100;
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
