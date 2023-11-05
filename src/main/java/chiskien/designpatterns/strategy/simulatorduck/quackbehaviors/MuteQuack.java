package chiskien.designpatterns.strategy.simulatorduck.quackbehaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
