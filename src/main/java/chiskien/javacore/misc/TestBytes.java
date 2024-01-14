package chiskien.javacore.misc;

import java.io.IOException;
import java.io.Serializable;

public class TestBytes {

    public static void main(String[] args) throws IOException {

    }

    private static class Human implements Serializable {
        String name;
        int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
