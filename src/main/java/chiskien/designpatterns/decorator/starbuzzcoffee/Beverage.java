package chiskien.designpatterns.decorator.starbuzzcoffee;

public abstract class Beverage {

    private String description;

    //Subclasses need to define their own implementation
    protected abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
