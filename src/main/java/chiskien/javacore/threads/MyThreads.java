package chiskien.javacore.threads;

public class MyThreads implements Runnable {

    public String name;

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Running " + name + " " + i);
        }
    }
}
