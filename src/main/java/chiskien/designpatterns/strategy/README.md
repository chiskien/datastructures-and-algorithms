# Strategy Design Pattern

## Problem:

> The one constant in software development
> "CHANGE"
> No matter how well you design an application, over time an application must grow and change, or it will die

## Solution:

- Inheritance is not fit well because the duck behavior keeps changing across subclasses
- Using interface is not take advantage of reusing code

=> Take what varies and "encapsulate" it so that later when alter or extend, it won't affect the rest of the code

- Pulling out what are likely to change (behaviors: fly, swim) from those that stay the same (duck)
- Create two sets of classes, one for `fly`, one for `quack`.
- Each set of classes will hold all the implementations of the respective behavior
=> Each behavior (`fly`, `quack`, `swim`) will have their own classes respectively

