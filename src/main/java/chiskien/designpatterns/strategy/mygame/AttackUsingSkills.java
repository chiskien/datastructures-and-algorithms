package chiskien.designpatterns.strategy.mygame;

public class AttackUsingSkills implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Casting skills...");
    }


}
