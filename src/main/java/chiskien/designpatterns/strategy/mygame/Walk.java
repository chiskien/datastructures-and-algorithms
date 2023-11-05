package chiskien.designpatterns.strategy.mygame;

public class Walk implements MovingBehavior {
    @Override
    public void move() {
        System.out.println("Moving slowly");
    }
}
