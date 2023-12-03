# Substring Search:

> Find a pattern of string `s` in a text of string `t`.

## Implementations:

- java implementations: `s.indexOf(t)`

## Applications:

- Electronics Surveillance
- Web Scraping: Scrap the web page sources to get the information

## Algorithms:

### 1. Brute Force Approach

- Using two nested for loop
- The first loop iterates through `t`
- The second tests if `s` occurs starting at the current index in `t`
- Time Complexity: 
    - Normal case: `O(m * (n-m))` with `m` is length of `s`, `n` is length of `t`.
    - Worst case: `O(n2)`

> [Source Code](FindTheFirstOccurrenceOfASubString.java)

### 2. Rabin-Karp Algorithm

> Rabin-Karp Algorithm by far is the simplest to understand and implement

- Similar to brute-force but does not require a second loop.
- Using the concepts of **fingerprint**:
  - Let `m` be the length of `s`. It computes the **hash codes** of each substrings whose length is `m`-these are the **fingerprint**.
- The key to efficiency is using an **incremental hash function** such as: 
  - A function with the property that the hash code of a string is an addictive function of each character (rolling hash).

#### Examples: 

Suppose `t` is "ABCDFUEEGG" and `s` is "FU". Define the code for "A" to be 0, the hash code for A is 1, B is 2, C is 3, etc. 

> [Code](RabinKarp.java)

### 3. Boyer Moore Algorithm

### 4. Knuth Morris Pratt Algorithm

#### 4.1 Deterministic finite state automation (DFA)