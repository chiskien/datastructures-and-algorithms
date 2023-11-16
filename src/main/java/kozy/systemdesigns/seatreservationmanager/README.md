# Seat Reservation Manager

Design a system that manages the reservation state of `n` seats that are numbered from `1` to `n`.
Implement the `SeatManager` class:

- `SeatManager(int n)` initializes a `SeatManager` object that will manage `n` seats numbered from `1` to `n`. All seats are initially available.
- `int reserve()` fetches the **smallest-numbered** unreserved seat, reserves it, and returns its number
- `void unreserve(int seatNumber)` unreserved the seat with the given `seatNumber`


=> Using Priority Queue (min-heap) data structure.