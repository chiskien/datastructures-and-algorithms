package chiskien.designpatterns.decorator.mymythicalshop.champions;

public abstract class Champion {

    String name = "Unknown Name";

    public String getName() {
        return name;
    }

    public abstract int attackDamage();

    public abstract int abilityPower();

    public abstract int movementSpeed();

    public abstract int health();

    public String getDescription() {
        return this.getName()
                + " has attack damage: " + attackDamage()
                + "; ability power: " + abilityPower()
                + "; health: " + health()
                + "; movementSpeed: " + movementSpeed()
                + "\n";
    }

}
