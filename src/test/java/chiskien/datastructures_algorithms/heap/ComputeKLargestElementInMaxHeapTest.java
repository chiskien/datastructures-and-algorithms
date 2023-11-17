package chiskien.datastructures_algorithms.heap;

import chiskien.datastructures_algorithms.heap.ComputeKLargestElementInMaxHeap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeKLargestElementInMaxHeapTest {

    ComputeKLargestElementInMaxHeap computeKLargestElementInMaxHeap;

    @BeforeEach
    void setUp() {
        computeKLargestElementInMaxHeap = new ComputeKLargestElementInMaxHeap();
    }

    @Test
    void normalCase1() {
        int[] heap = new int[]{500, 200, 300, 150, 160, 290, 270, 100, 120, 140, 155, 280, 281, 260, 265};

        int k = 6;

        List<Integer> actual = computeKLargestElementInMaxHeap.kLargestElement(heap, k);
        List<Integer> expected = List.of(500, 300, 290, 281, 280, 270);
        assertEquals(expected, actual);
    }

    @Test
    void smallRange() {
        int[] heap = new int[]{6, 4, 5, 2, 3};
        int k = 2;
        List<Integer> actual = computeKLargestElementInMaxHeap.kLargestElement(heap, k);
        List<Integer> expected = List.of(6,5);
        assertEquals(expected, actual);
    }
}