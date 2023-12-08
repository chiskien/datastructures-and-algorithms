package chiskien.designpatterns.decorator.mymythicalshop.items;

import chiskien.designpatterns.decorator.mymythicalshop.champions.Champion;

public class Boots extends ItemsDecorator {

    public Boots(Champion champion) {
        this.champion = champion;
    }

    @Override
    public int attackDamage() {
        return champion.attackDamage();
    }

    @Override
    public int abilityPower() {
        return champion.abilityPower();
    }

    @Override
    public int movementSpeed() {
        return champion.movementSpeed() + 70;
    }

    @Override
    public int health() {
        return champion.health();
    }

    @Override
    public String getDescription() {
        return champion.getName()
                + " after purchasing Boots, " + champion.getName()
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
