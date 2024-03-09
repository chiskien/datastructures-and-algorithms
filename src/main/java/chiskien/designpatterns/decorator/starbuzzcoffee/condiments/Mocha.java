package chiskien.designpatterns.decorator.starbuzzcoffee.condiments;

import chiskien.designpatterns.decorator.starbuzzcoffee.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    private double mochaCost;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setMochaCost(20);
    }


    public void setMochaCost(double mochaCost) {
        this.mochaCost = mochaCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + mochaCost;
    }

}
