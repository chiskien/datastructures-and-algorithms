package chiskien.effectivejava.chapter1_objectslifecycle.item1;

public class NutritionFacts {

    private final int SERVING_SIZE;
    private final int SERVINGS;
    private final int CALORIES;
    private final int FAT;
    private final int SODIUM;
    private final int CARBOHYDRATE;

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "SERVING_SIZE=" + SERVING_SIZE +
                ", SERVINGS=" + SERVINGS +
                ", CALORIES=" + CALORIES +
                ", FAT=" + FAT +
                ", SODIUM=" + SODIUM +
                ", CARBOHYDRATE=" + CARBOHYDRATE +
                '}';
    }

    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional Params:
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;


        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int value) {
            calories = value;
            return this;
        }

        public Builder fat(int value) {
            fat = value;
            return this;
        }

        public Builder sodium(int value) {
            sodium = value;
            return this;
        }

        public Builder carbohydrate(int value) {
            carbohydrate = value;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        SERVING_SIZE = builder.servingSize;
        SERVINGS = builder.servings;
        FAT = builder.fat;
        CALORIES = builder.calories;
        SODIUM = builder.sodium;
        CARBOHYDRATE = builder.carbohydrate;
    }
}