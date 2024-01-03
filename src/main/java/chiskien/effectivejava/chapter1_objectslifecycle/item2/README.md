# Consider a builder when faced with many constructor parameters

> A class can provide its clients with **static factory** instead of, or in addition to, **public constructors**

- A class can provide a public _static factory method_, which is simply a static method that returns an instance of the
  class

## Advantages:

### 1. Static factories have names.

### 2. Static factories are not required to create a new object each time they are invoked.

- Allows Immutable classes to use pre-constructed instances

### 3. Static factories can return an object of any subtype of their return type.

[Back to indexing](../../README.md)