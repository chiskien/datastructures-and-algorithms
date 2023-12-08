package chiskien.designpatterns.decorator.mymythicalshop.champions;

public class Sylas extends Champion {


    public Sylas() {
        name = "Sylas";
    }

    @Override
    public String getDescription() {
        return this.getName()
                + " has attack damage: " + attackDamage()
                + "; ability power: " + abilityPower()
                + "; health: " + health()
                + "; movementSpeed: " + movementSpeed()
                + "\n";
    }

    @Override
    public int attackDamage() {
        return 100;
    }

    @Override
    public int abilityPower() {
        return 0;
    }

    @Override
    public int movementSpeed() {
        return 365;
    }

    @Override
    public int health() {
        return 1400;
    }
}
