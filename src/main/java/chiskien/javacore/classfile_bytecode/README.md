## Class files and ByteCodes

> Objectives:
> - Class Loading
> - Reflection
> - The anatomy of class files
> - JVM bytecodes and why it matters

- Imagine you encounter an application that makes heavy use of DI technique such as Spring.
- It develops a problems starting up and fails with a cryptic error messages.
- All but the simplest application can fail with a `ClassNotFoundException` or `NoClassDefFoundException`
- 