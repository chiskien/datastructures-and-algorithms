package chiskien.designpatterns.strategy.mygame;

import java.util.List;

public abstract class Champion {
    protected Long id;
    protected String name;
    protected Long baseHealth;
    protected List<Skill> skill;
    protected AttackBehavior attackBehavior;
    protected DefenseBehavior defenseBehavior;
    protected MovingBehavior movingBehavior;

    public void performAttack() {
        attackBehavior.attack();
    }

    public void performDefense() {
        defenseBehavior.defense();
    }

    public void performMoving() {
        movingBehavior.move();
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = defenseBehavior;
    }

    public void setMovingBehavior(MovingBehavior movingBehavior) {
        this.movingBehavior = movingBehavior;
    }

    public abstract void display();
}
