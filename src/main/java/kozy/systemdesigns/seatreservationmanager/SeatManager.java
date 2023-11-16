package kozy.systemdesigns.seatreservationmanager;


import java.util.PriorityQueue;

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

    public void unreserve(int seatNumber) {
        availableSeats.offer(seatNumber);
    }

}
