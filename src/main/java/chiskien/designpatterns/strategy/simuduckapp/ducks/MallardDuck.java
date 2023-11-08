package chiskien.designpatterns.strategy.simuduckapp.ducks;

import chiskien.designpatterns.strategy.simuduckapp.flybehaviors.FlyWithWings;
import chiskien.designpatterns.strategy.simuduckapp.quackbehaviors.Quack;

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
