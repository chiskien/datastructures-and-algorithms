# Factory Design Pattern

- There is more to making objects than just using the `new` operator.

## Context / Problem

- When using `new` to create objects, think that is **concrete** (not an abstraction).
- Examples:

```java
import chiskien.designpatterns.strategy.simuduckapp.ducks.MallardDuck;
import chiskien.designpatterns.strategy.simuduckapp.ducks.RedHeadDuck;

class Duck {
    public Duck getDuck(String name) {
        Duck d;
        if (name.equals("Mallard")) {
            d = new MallardDuck();
        } else if (name.equals("RedHead")) {
            d = new RedHeadDuck();
        } else {
            d = new Duck();
        }
        return d;
    }
}
```

**Demo for instantiating Ducks based on the input name**

- The problem is that, each time we have a new class `Duck` we have to modify this code, adding another if-else
  statement (which violates the [Open Closed Principles](../README.md#design-principles))
=> Hard for maintenance and error-prone.

### What's wrong with the `new` ?

