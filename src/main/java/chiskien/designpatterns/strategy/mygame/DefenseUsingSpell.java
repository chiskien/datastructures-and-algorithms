package chiskien.designpatterns.strategy.mygame;

public class DefenseUsingSpell implements DefenseBehavior {
    @Override
    public void defense() {
        System.out.println("Casting spell to generate shields");
    }
}
