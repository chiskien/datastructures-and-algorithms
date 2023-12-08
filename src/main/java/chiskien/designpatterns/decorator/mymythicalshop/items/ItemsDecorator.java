package chiskien.designpatterns.decorator.mymythicalshop.items;

import chiskien.designpatterns.decorator.mymythicalshop.champions.Champion;

public abstract class ItemsDecorator extends Champion {

    Champion champion; //wrapped champion

    public String getDescription() {
        return champion.getName()
                + " after purchasing " + this.getClass().getSimpleName() +
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

    ;

}
