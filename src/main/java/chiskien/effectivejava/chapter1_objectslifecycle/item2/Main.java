package chiskien.effectivejava.chapter1_objectslifecycle.item2;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(213, 12)
                .carbohydrate(232)
                .fat(232)
                .build();
        Champion champion = new Champion.Builder("Sylas")
                .abilitiesPower(2020)
                .build();

        Book newBook = Book.builder()
                .id(2312321L)
                .author("James Clear")
                .price(200)
                .isbn("222222222")
                .title("Atomic Habits")
                .build();
        System.out.println(newBook);
        System.out.println(champion);
        System.out.println(nutritionFacts);
    }
}
