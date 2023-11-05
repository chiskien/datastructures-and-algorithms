package chiskien.designpatterns.strategy.simulatorduck.quackbehaviors;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
