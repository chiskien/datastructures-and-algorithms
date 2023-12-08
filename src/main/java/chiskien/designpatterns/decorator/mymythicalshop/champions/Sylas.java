package chiskien.designpatterns.decorator.mymythicalshop.champions;

public class Sylas extends Champion {


    public Sylas() {
        name = "Sylas";
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
