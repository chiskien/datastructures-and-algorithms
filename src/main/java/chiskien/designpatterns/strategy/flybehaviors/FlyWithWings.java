package chiskien.designpatterns.strategy.flybehaviors;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wing");
    }
}
