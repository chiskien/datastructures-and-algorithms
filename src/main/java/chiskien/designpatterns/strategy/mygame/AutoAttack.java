package chiskien.designpatterns.strategy.mygame;

public class AutoAttack implements AttackBehavior {

    @Override
    public void attack() {
        System.out.println("Using auto attack...");
    }
}
