package crykos.systemdesigns.seatreservationmanager;

import java.util.PriorityQueue;


/**
 * Design a system that manages the reservation state of seats that are numbered from 1 to n.
 * Implement the {@link crykos.systemdesigns.seatreservationmanager.SeatManager} class:
 * <p>
 * - {@code SeatManager(int n)} initializes a  {@code SeatManager} object that will manage seats numbered from 1 to n. All seats are initially available.
 * {@code int reserve()} fetches the <b>smallest-numbered </b>unreserved seat, reserves it, and returns its number
 * <br>
 * - {@code void unreserved(int seatNumber)} unreserved the seat with the given {@code seatNumber}
 * <p>
 * <p>
 * => Using Priority Queue (min-heap) data structure.
 * @author chisk
 * @see chiskien.datastructures_algorithms.heap.implementations.PriorityQueueCK
 * @since 2023
 */


public class SeatManager {
    PriorityQueue<Integer> availableSeats;

    public SeatManager(int n) {
        availableSeats = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            availableSeats.add(i);
        }
    }

    public int reserve() {
        if (!availableSeats.isEmpty()) {
            return availableSeats.poll();
        }
        return -1;
    }

    public void unreserved(int seatNumber) {
        availableSeats.offer(seatNumber);
    }

}
