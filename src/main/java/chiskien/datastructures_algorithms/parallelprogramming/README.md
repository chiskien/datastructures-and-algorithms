# Concurrency/Multithreading/Parallel Algorithms and Problems

## Prerequisites:

1. [Multi-threading/Concurrency with Java Core](../../javacore/threads/README.md)
2. [Concurrency in Effective Java](../../effectivejava/chapter10_concurrency/README.md)

## Benefits of Parallel Programming

1. **High Performance**: More processors working on a task
2. **Better use of resources**: A program can be executed while another waits on the disk or network
3. **Fairness**: Letting different users or programs share a machine rather than have one program run at a time to
   completion
4. **Convenience**: It is often conceptually more straightforward to do a task using a set of concurrent programs for
   the
   subtasks rather than have a single program manage all the subtasks.
5. **Fault tolerance**: If a machine fails in a cluster serving web pages, the others can take over.

## Applications:

Concrete Applications of parallel programming include:

1. **Graphical User Interface** (GUI).
    - A dedicated thread handles UI while other threads are, for example, doing network communication and passing
      results to the UI threads => increased responsiveness
2. **Java Virtual Machine**
    - A separate thread handles garbage collection which would otherwise lead to blocking
    - While other threads are running the user code.
3. **Web Servers**
    - Thread-per-request models: A single logical thread handles a single client request
4. **Web Search**
    - Multiple machines crawl, index, and retrieve web pages.

## Models

There are two primary models for parallel computation:

### 1. Shared Memory model

- Each processor can access any location in memory
- This model is appropriate in the multicore settings

### 2. Distributed Memory model

- A processor must explicitly send a message to another processor to access its memory
- This model is more accurate for a cluster

> The problems in this chapter focus on thread-level parallelism.
> Problems concerned with parallelism on distributed memory architectures,
> e.g., cluster computing, are usually not meant to be coded; they are popular design and architecture problems

## Challenging:

- Writing correct parallel program is challenging because of the subtle interactions between parallel components.
- The Key challenges are:
    - **Races**: two concurrent instruction sequences access the same address in memory, and at least
      one of them writes to that access
    - **Starvation**: A processor needs a resource but never gets it [Readers-writers problem]()
    - **Deadlock**: Thread A acquired Lock L1 and Thread B acquired Lock L2, following which A tries to acquire L2 and B
      tries to acquire L1
    - **Livelock**: A processor keeps retrying on an operation that always fails.

- Bugs caused by these issues are difficult to find using testing
- Debugging them is also challenging because they may not be reproducible since they are usually load dependent.
- It is true that it is not possible to realize the performance implied by parallelism-sometimes a critical task cannot
  be parallelized, making it impossible to improve performance, regardless of the number of processors added.

## Parallel Programming Bootcamp

### Semaphore (java.util.concurrent.Semaphore)

- A semaphore is a very powerful synchronization construct
- Conceptually, a semaphore maintains a set of permits.
- A thread calling `acquire()` on a semaphore waits, if necessary, until a permit is available, and then takes it.
- A thread calling `release()` on a semaphore adds a permit and notifies threads waiting on that semaphore, potentially
  releasing a blocking acquirer.

[Demo Semaphore](SemaphoreCK.java)

## Algorithms

- Start with an algorithm that **locks aggressively** and is easily to be correct.
- Then **add back concurrency**, while ensuring the **critical** parts are
  locked. [Implement Caching for Multi-threaded Dictionary](ImplementCachingForMultithreadedDictionary.java), [Readers-writers problem]()

- When analyzing parallel code, assume a worst-case thread scheduler. In particular, it may choose to schedule the same
  thread repeatedly, it may alternative between two threads, it may starve a thread

## Specific Problems:

1. Implement Caching for a Multi-threaded Dictionary
2. Analyze two unsynchronized interleaved threads
3. Implement synchronization for two interleaving threads
4. Implement Thread pool
5. Deadlock
6. Readers-writers problem
7. The readers-writers problem with written preference
8. Implement a Timer Class
9. Test the Collatz Conjecture in Parallel