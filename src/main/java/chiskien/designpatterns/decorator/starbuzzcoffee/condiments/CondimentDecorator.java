package chiskien.designpatterns.decorator.starbuzzcoffee.condiments;

import chiskien.designpatterns.decorator.starbuzzcoffee.beverages.Beverage;

//the decorator class
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; //wrapped object

    @Override
    public abstract String getDescription();

}
