package chiskien.designpatterns.strategy.simuduckapp.quackbehaviors;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
