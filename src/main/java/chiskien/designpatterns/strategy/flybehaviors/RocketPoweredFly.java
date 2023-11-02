package chiskien.designpatterns.strategy.flybehaviors;

public class RocketPoweredFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm the god of speed");
    }
}
