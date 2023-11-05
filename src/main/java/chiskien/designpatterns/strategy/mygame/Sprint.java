package chiskien.designpatterns.strategy.mygame;

public class Sprint implements MovingBehavior{
    @Override
    public void move() {
        System.out.println("Sprinting....");
    }
}
