package chiskien.designpatterns.decorator.mymythicalshop.items;

import chiskien.designpatterns.decorator.mymythicalshop.champions.Champion;

import java.util.List;

public abstract class ItemsDecorator extends Champion {

    Champion champion; //wrapped champion

    public abstract String items();

    @Override
    public String getDescription() {
        return champion.getName()
                + " after purchasing " + items() +
                ", " + champion.getName()
                + " has attack damage: " + attackDamage()
                + "; ability power: " + abilityPower()
                + "; health: " + health()
                + "; movementSpeed: " + movementSpeed()
                + "\n";
    }

    public String getName() {
        return champion.getName();
    }
}
