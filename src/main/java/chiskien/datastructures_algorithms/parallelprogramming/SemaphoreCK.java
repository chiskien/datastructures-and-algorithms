package chiskien.datastructures_algorithms.parallelprogramming;

//Implementing SemaphoreCK in Java
class SemaphoreCK {
    //the program show how to implement a semaphore in Java, using synchronization, wait(), and notify() language primitives
    private final int MAX_AVAILABLE;
    private int taken;

    public SemaphoreCK(int maxAvailable) {
        MAX_AVAILABLE = maxAvailable;
        this.taken = 0;
    }

    public synchronized void accquire() throws InterruptedException {
        while (taken == MAX_AVAILABLE) {
            wait();
        }
        taken++;
    }

    public synchronized void release() throws InterruptedException {
        taken--;
        notifyAll();
    }
}
