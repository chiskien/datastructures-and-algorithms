# Threads / Concurrency Programming / Parallel Programming

- In Programming, _**concurrent**_ operations denote multiple, typically unrelated tasks running at the same time.
- Think of a fast-food cook preparing multiple orders on a grill.
  **__Parallel__** operation usually involves breaking up a large task into related subtasks
  that can be run alongside each other to produce the final result more quickly.
- The units of concurrency for an operating system were the application or _process_.
- To the OS, the process was more or less a black box that decided what to do on its own.
- Later, operating systems added another concept called _**threads**_. A **Thread** is a **_flow of control_** within a
  program
- Threads provide fine-grained concurrency within a process under the application's own control.

## Introducing Threads

- A Thread is similar to the notion of a **_process_**, or a running program, except that different threads within the
  same application are much more closely related and share much of the same state that different programs running on the
  same machine.
- Threads cooperate to share a working area. They take turns and wait for other threads.
- Threads have access to the same objects, including static and instance variables, within their application
- However, threads have their own local variables.

- Multiple threads in an application have a problem: **_synchronization_**. As you cannot have several threads trying to
  access the same variables without any kind of coordination.

### The Thread class and the Runnable Interface

- All executions in Java are associated with a `Thread` object, beginning with a "main" thread that the JVM starts to
  launch your application.

#### How to run code in a different thread?

=> Create a class implement a `Runnable` interface.

```java
class MyThreads implements Runnable {
    @Override
    public void run() {
        //do something
    }
}

class Main {
    public static void main(String[] args) {
        MyThreads customRunnable = new MyThreads();
        Thread thread1 = new Thread(customRunnable);
        thread1.start();
    }
}
```

### Controlling Threads

- `Thread.sleep()` method:
    - Causes the currently executing thread to wait for a designated period of time (give or take), without consuming much (or possible any) CPU time.
- `wait()` and `join()` methods
    - Coordinate the execution of two or more threads.
- `interrupt()` method:
    - Wake up a thread that is sleeping in a `sleep()` or `wait()` operation or is otherwise blocked on a long I/O operation

### The `sleep()` method
