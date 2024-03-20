package chiskien.javacore.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        MyThreads t1 = new MyThreads(2);
//        MyThreads t2 = new MyThreads(2);
//        t1.name = "thread1";
//        t2.name = "thread2";
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
//        thread1.start();
//        thread2.start();
        int nCPUs = Runtime.getRuntime().availableProcessors();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println(nCPUs);
        System.out.println(totalMemory);
    }

}
