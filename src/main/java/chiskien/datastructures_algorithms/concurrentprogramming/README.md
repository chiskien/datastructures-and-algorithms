# Concurrency/Multithreading/Parallel Algorithms and Problems

## Prerequisites:

1. [Multi-threading/Concurrency with Java Core](../../javacore/threads/README.md)
2. [Concurrency in Effective Java](../../effectivejava/chapter10_concurrency/README.md)

## Benefits of Concurrent Programming

1. High Performance: More processors working on a task
2. Better use of resources: A program can be executed while another waits on the disk or network
3. Fairness: Letting different users or programs share a machine rather than have one program run at a time to
   completion
4. Convenience: It is often conceptually more straightforward to do a task using a set of concurrent programs for the
   subtasks rather than have a single program manage all the subtasks.
5. Fault tolerance: If a machine fails in a cluster serving web pages, the others can take over.

## Problems

1. Implement Caching for a Multi-threaded Dictionary
2. Analyze two unsynchronized interleaved threads
3. Implement synchronization for two interleaving threads
4. Implement Thread pool
5. Deadlock
6. Readers-writers problem
7. The readers-writers problem with written preference
8. Implement a Timer Class
9. Test the Collatz Conjecture in Parallel