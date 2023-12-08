package chiskien.designpatterns.decorator.mymythicalshop.items;

import chiskien.designpatterns.decorator.mymythicalshop.champions.Champion;

public class Everfrost extends ItemsDecorator {
    public Everfrost(Champion champion) {
        this.champion = champion;
    }

    @Override
    public int attackDamage() {
        return champion.attackDamage();
    }

    @Override
    public int abilityPower() {
        return champion.abilityPower() + 100;
    }

    @Override
    public int movementSpeed() {
        return champion.movementSpeed();
    }

    @Override
    public int health() {
        return champion.health() + 500;
    }

    @Override
    public String getDescription() {
        return champion.getName()
                + " after purchasing Everfrost, " + champion.getName()
                + " has attack damage: " + attackDamage()
                + "; ability power: " + abilityPower()
                + "; health: " + health()
                + "; movementSpeed: " + movementSpeed()
                + "\n";
    }

    @Override
    public String getName() {
        return champion.getName();
    }

}
