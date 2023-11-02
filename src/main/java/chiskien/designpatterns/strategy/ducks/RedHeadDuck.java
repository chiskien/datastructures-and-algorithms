package chiskien.designpatterns.strategy.ducks;

import chiskien.designpatterns.strategy.flybehaviors.RocketPoweredFly;
import chiskien.designpatterns.strategy.quackbehaviors.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new RocketPoweredFly();
        name = "Redhead deck";
    }

    @Override
    public void display() {
        System.out.println("I'm a " + name);
    }
}
