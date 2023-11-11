package chiskien.javacore.threads;

public class Main {

    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        t1.name = "thread1";
        t2.name = "thread2";
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }

}
