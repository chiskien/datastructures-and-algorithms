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

- The problem is that, each time we have a new `Duck` we have to modify that code, adding another if-else statement (
  which violates the [Open Closed Principles](../README.md#design-principles))

=> Hard for maintenance and error-prone.

### What's wrong with the `new` ?

- There is nothing wrong with the `new` operator.
- The real problem is **CHANGE** and how change impacts the use of `new`

- By coding to an interface/abstract class (not an implementation), you can insulate (cách ly, cô lập) yourself from
  many changes.
- Because when coding to interface, it will work with any new classes implementing that interface (polymorphism)
- However, when code that makes use a lot of concrete classes (like the `Duck` above), this causes a problem that code
  may have to be **CHANGED** as new concrete class are arrived (example: new RubberDuck => new if-else statement) => not
  **closed for modification**

=> What can you do?
=> Let's rewind to chapter 1:
_**[identify the aspects that vary and separate them from what stays the same.](../strategy/README.md)**_

###     