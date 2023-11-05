package chiskien.designpatterns.strategy.mygame;

public abstract class Character {
    private Long id;
    private String name;
    private Weapon weapon;
    private AttackBehavior attackBehavior;
    private DefenseBehavior defenseBehavior;
}
