package chiskien.designpatterns.strategy.simuduckapp.ducks;

import chiskien.designpatterns.strategy.simuduckapp.flybehaviors.RocketPoweredFly;
import chiskien.designpatterns.strategy.simuduckapp.quackbehaviors.Quack;

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
