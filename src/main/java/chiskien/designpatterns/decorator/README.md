# Decorator Design Pattern

## Context / Problems :

- Imagine you are the chairperson of The Starbuzz Coffee. You want to digitalize the menu

- Your system might look like this:
  ![img_1.png](images/img.png)

- With every new condiment or toppings, we have to change the cost of each beverage to suit with their type.
- The result will be like this:
- ![img_1.png](images/img_1.png)

=> **An explosion of classes**

=> Hard for maintenance, and violates the [2](../README.md#design-principle) and [4](../README.md#design-principles)
design
principles.

### How to achieve code reuse without **inheritance** ?

> Through _**composition**_ and _**delegation**_ (Chapter 1: Strategy Pattern and Chapter 2: Observer Pattern)

- When inherit behavior by subclassing, that behavior is set statically at compile time.
- All subclasses must inherit the same behavior as their superclass.
- If extend object's behavior through **composition**, that will be set dynamically at runtime.

### Open-Closed Principle

> Classes should be open for extension, but closed for modification.

- Be careful when choosing the areas of code that need to be extended

## Meet the Decorator Pattern

- Representing beverages and condiments with **inheritance** is not fit well (classes explosion).
  => Start with a beverage and **decorate** it with condiments at the runtime.
- Example: If a customer wants a Mocha with extra Milk Foam and Chocolate Cookie:
    1. Start with a `Espresso` object.
    2. Decorate it with a `Mocha` object.
    3. Decorate it with a `ChocolateCookie` object.
    4. Call the `cost()` method and rely on delegation to add up the condiment costs.

### Definition:

> The **Decorator Pattern** attaches additional responsibilities to an object dynamically. Decorators provide a flexible
> alternative to subclassing for extending functionality.

### Characteristics:

1. Decorators have the same supertype as the objects they decorate.
2. You can use one of more decorators to wrap an object
3. Given that the decorator has the same supertype as the objects it decorates, we can pass around a decorated object in
   place of the original (wrapped) object.
4. The decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the
   job.
5. Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we
   like.

### Class Diagram:

![img_2.png](images/img_2.png)

### Applying:

![img_3.png](images/img_3.png)

### Why using **inheritance** here (`CondimentDecorator` extends `Beverage`) ?

- Using **inheritance** to achieve the _type matching_ (Characteristics#1), but not for the _behavior_

### Implementations

- Check out demo [Starbuzz](starbuzzcoffee) and my own implementation [MythicShop](mymythicalshop)