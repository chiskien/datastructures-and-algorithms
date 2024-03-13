package chiskien.javacore.threads;

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
}

class A extends Thread {
    @Override
    public void run() {
        super.run();
    }
}