package chiskien.designpatterns.decorator.starbuzzcoffee.condiments;

import chiskien.designpatterns.decorator.starbuzzcoffee.beverages.Beverage;

public class ChocolateCookie extends CondimentDecorator {

    private double chocolateCookieCost;

    public ChocolateCookie(Beverage beverage) {
        this.beverage = beverage;
        setChocolateCookieCost(20);
    }

    @Override
    public double cost() {
        return beverage.cost() + chocolateCookieCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate Cookie";
    }

    public void setChocolateCookieCost(double chocolateCookieCost) {
        this.chocolateCookieCost = chocolateCookieCost;
    }
}
