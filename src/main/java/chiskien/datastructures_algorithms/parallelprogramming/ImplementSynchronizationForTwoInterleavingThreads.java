package chiskien.datastructures_algorithms.parallelprogramming;


import java.util.concurrent.locks.Lock;

/**
 * <p>
 * Thread t1 print odd numbers from 1 to 10.
 * Thread t2 print even numbers from 1 to 100
 * </p>
 * Write code in which the two threads, running concurrently, print number from 1 to 100 in order.
 * <br>
 * <br>
 * <b>Solution:</b> A Brute-force solution is to use a <b>lock</b> which is repeatedly captured by the threads. A single variable, protected by the lock, indicates who went last.
 * The drawback is that it employs the busy waiting anti-pattern:
 * <br>
 *
 * @author chisk
 * @since 21
 */
public class ImplementSynchronizationForTwoInterleavingThreads {
    public static class OddEvenMonitor {
        private static final boolean ODD_TURN = true;
        private static final boolean EVEN_TURN = false;
        private boolean turn = ODD_TURN;

        //need synchronized in order to call wait()
        public synchronized void waitTurn(boolean oldTurn) {
            while (turn != oldTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException in wait(): " + e);
                }
            }
        }

        public synchronized void toggleTurn() {
            turn ^= true;
            notifyAll();
        }
    }

    public static class OddThread extends Thread {
        private final OddEvenMonitor monitor;

        public OddThread(OddEvenMonitor monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 100; i += 2) {
                monitor.waitTurn(OddEvenMonitor.ODD_TURN);
                System.out.println("i = " + i);
                monitor.toggleTurn();
            }
        }
    }

    public static class EvenThread extends Thread {
        private final OddEvenMonitor monitor;

        public EvenThread(OddEvenMonitor monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            for (int i = 2; i < 100; i += 2) {
                monitor.waitTurn(OddEvenMonitor.EVEN_TURN);
                System.out.println("i = " + i);
                monitor.toggleTurn();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OddEvenMonitor monitor = new OddEvenMonitor();
        Thread t1 = new OddThread(monitor);
        Thread t2 = new EvenThread(monitor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
