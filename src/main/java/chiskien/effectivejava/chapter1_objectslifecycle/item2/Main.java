package chiskien.effectivejava.chapter1_objectslifecycle.item2;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(213, 12)
                .carbohydrate(232)
                .fat(232)
                .build();
        Champion champion = new Champion.Builder("Sylas")
                .build();
        System.out.println(champion);
        System.out.println(nutritionFacts);
    }
}
