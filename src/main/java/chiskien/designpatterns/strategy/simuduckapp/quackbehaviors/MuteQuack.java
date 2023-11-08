package chiskien.designpatterns.strategy.simuduckapp.quackbehaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
