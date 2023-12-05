# Hash Table

## Terminologies:

- Java: HashMap
- Python,C#: Dictionary
- Javascript, Typescript: object

> The idea underlying a hash table is to store objects according to their key field in an array.
> Objects are stored in array locations ("slot") based on the 'hash code' of the key

- The hash code is an integer computed from the key by a hash function.
- If two keys map to the same location, a **collision** is said to occur.
- The standard mechanism to deal with collisions is to maintain a linked list of objects at each array location.
- If the hash function does a good job spreading objects across the underlying array and take `O(1)` time to compute, on average, lookups (search), insertions, and deletions have `O(1 + n/m)` time complexity, where `n` is the number of objects and `m` is the length of the array.