package chiskien.designpatterns.strategy.simulatorduck.ducks;

import chiskien.designpatterns.strategy.simulatorduck.flybehaviors.FlyWithWings;
import chiskien.designpatterns.strategy.simulatorduck.quackbehaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        name = "Mallard Duck";
    }

    @Override
    public void display() {
        System.out.println("I'm a " + name);
    }
}
