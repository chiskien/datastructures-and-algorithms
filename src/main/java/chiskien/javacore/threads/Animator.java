package chiskien.javacore.threads;

public class Animator implements Runnable {

    boolean animating = true;


    @Override
    public void run() {
        while (animating) {
            System.out.println("Rotating");
        }
    }
}
