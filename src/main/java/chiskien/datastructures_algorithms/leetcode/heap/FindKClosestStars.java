package chiskien.datastructures_algorithms.leetcode.heap;

import java.util.*;

class FindKClosestStars {

    /*
    Consider a coordinate system for the Excellent Universe, in which Earth is located at coordinate (0,0,0). The Excellent Universe consists of Math.pow(10.2) stars.
    Compute the K stars that are closest to Earth.
    */

    //Solution: using a max-heap to store stars
    public static void main(String[] args) {
        FindKClosestStars findKClosestStars = new FindKClosestStars();
        Collection<Star> stars = List.of(
                new Star(2, 0, 2),
                new Star(1231, 20, 80),
                new Star(12121, 2, 2),
                new Star(654, 3, 2),
                new Star(3232, 2, 2),
                new Star(111, 9, 2),
                new Star(223, 2099, 2),
                new Star(600, 600, 2),
                new Star(34234, 77, 56),
                new Star(1, 1, 1)
        );
        findKClosestStars.findKClosestStars(3, stars);
    }

    public List<Star> findKClosestStars(int k, Collection<Star> stars) {
        //max-heap to store the k closest stars seen so far
        PriorityQueue<Star> maxHeap = new PriorityQueue<>(
                k, Collections.reverseOrder()
        );
        for (Star star : stars) {
            //add each star to the heap
            //if the max-heap size exceeds k, remove the maximum element from the heap
            maxHeap.add(star);
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }
        List<Star> orderedStars = new ArrayList<>(maxHeap);
        Collections.sort(orderedStars);
        //The only guarantee PriorityQueue/Heap makes about ordering is that the maximum elements come first, so we sort orderedStars
        return orderedStars;
    }


}

class Star implements Comparable<Star> {
    double x;
    double y;
    double z;

    public Star(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public int compareTo(Star o) {
        return Double.compare(this.getDistance(), o.getDistance());
    }

    @Override
    public String toString() {
        return "Star{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
