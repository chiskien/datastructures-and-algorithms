package chiskien.designpatterns.strategy.ducks;

import chiskien.designpatterns.strategy.flybehaviors.FlyBehavior;
import chiskien.designpatterns.strategy.quackbehaviors.QuackBehavior;

public abstract class Duck {
    //All normal behavior of a regular duck

    //These behavior variables are declared as the behavior INTERFACE type
    //Instance variables hold a reference to a specific behavior at runtime.
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    protected String name;

    public Duck() {
    }

    public void performQuack() {
        quackBehavior.quack(); //delegate action
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {

    }

    public abstract void display();
}
