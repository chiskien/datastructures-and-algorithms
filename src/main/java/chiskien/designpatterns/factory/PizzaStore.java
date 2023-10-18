package chiskien.designpatterns.factory;

public abstract class PizzaStore {

    /* Each subclass provides an implementation of the createPizza() method,
     overriding the abstract createPizza() method in Pizza Store,
     while all subclasses make use of the orderPizza() method defined in Pizza Store.
     We could make the orderPizza() method final if we really wanted to enforce this.*/

    protected abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type) {
        Pizza p = createPizza(type); //using abstract method
        String slogan = p.getClass().getSimpleName();
        p.setName(slogan);
        p.prepare();
        p.bake();
        p.cut();
        p.box();

        return p;
    }
}
