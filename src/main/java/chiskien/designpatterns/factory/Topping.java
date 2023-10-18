package chiskien.designpatterns.factory;

public class Topping {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Topping(String name) {
        this.name = name;
    }
}