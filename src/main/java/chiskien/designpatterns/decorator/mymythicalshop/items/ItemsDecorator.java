package chiskien.designpatterns.decorator.mymythicalshop.items;

import chiskien.designpatterns.decorator.mymythicalshop.champions.Champion;

public abstract class ItemsDecorator extends Champion {

    Champion champion; //wrapped champion

    public abstract String getDescription();

    public abstract String getName();

}
