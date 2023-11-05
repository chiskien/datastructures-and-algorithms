package chiskien.designpatterns.strategy.simulatorduck.ducks;

import chiskien.designpatterns.strategy.simulatorduck.flybehaviors.RocketPoweredFly;
import chiskien.designpatterns.strategy.simulatorduck.quackbehaviors.Quack;

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
