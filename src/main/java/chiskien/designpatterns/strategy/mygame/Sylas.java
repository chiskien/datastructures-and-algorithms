package chiskien.designpatterns.strategy.mygame;

public class Sylas extends Champion {
    public Sylas() {
        movingBehavior = new Sprint();
        attackBehavior = new AttackUsingSkills();
        defenseBehavior = new DefenseUsingSpell();
        name = this.getClass().getSimpleName();
    }

    @Override
    public void display() {
        System.out.println("I am " + name);
    }
}
