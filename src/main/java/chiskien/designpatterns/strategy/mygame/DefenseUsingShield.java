package chiskien.designpatterns.strategy.mygame;

public class DefenseUsingShield implements DefenseBehavior {
    @Override
    public void defense() {
        System.out.println("Reinforcing shield");
    }
}
