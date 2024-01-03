package chiskien.effectivejava.chapter1_objectslifecycle.item2;

public class Champion {

    private final String name;
    private final int health;

    private final int attackDamage;
    private final int magicAbilities;
    private final int armor;
    private final int magicResistance;

    public Champion(Builder builder) {
        this.name = builder.name;
        this.armor = builder.armor;
        this.magicAbilities = builder.magicAbilities;
        this.magicResistance = builder.magicResistance;
        this.attackDamage = builder.attackDamage;
        this.health = builder.health;
    }

    public static class Builder {
        private final String name;
        private int health = 200;
        private int attackDamage = 60;
        private int magicAbilities = 0;
        private int armor = 50;
        private int magicResistance = 50;

        public Builder(String name) {
            this.name = name;
        }

        public Builder health(int value) {
            this.health = value;
            return this;
        }

        public Builder attackDamage(int value) {
            this.attackDamage = value;
            return this;
        }

        public Builder abilitiesPower(int value) {
            this.magicAbilities = value;
            return this;
        }

        public Builder armor(int value) {
            this.armor = value;
            return this;
        }

        public Builder magicResistance(int value) {
            this.magicResistance = value;
            return this;
        }

        public Champion build() {
            return new Champion(this);
        }
    }
}
