## Item 3: Enforce the singleton property with a private constructor or an enum type

- A **singleton** is simply a class instantiated exactly once
- Making a class **singleton** can make it difficult to test its clients because it's impossible to substitute a mock implementation for a singleton unless it implements an interface that serves as its type
- 