package chiskien.javacore.misc;

public class Polymorphism {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.bark();
    }
}

class Animal {
    public Animal() {
        System.out.println("I am an animal");
    }
    public void bark() {
        System.out.println("bark bark");
    }

    public void ss() {

    }
}

class Dog extends Animal {
    private String name;

    public Dog() {
        System.out.println("I am a dog");
    }

    public String getName() {
        return name;
    }
    public void bark() {
        System.out.println("Wolf wolf");
    }

    public void setName(String name) {
        this.name = name;
    }
}