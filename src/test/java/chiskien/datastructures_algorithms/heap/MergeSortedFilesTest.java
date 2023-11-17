package chiskien.datastructures_algorithms.heap;

import chiskien.datastructures_algorithms.heap.MergeSortedFiles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MergeSortedFilesTest {
    MergeSortedFiles mergeSortedFiles;

    @BeforeEach
    void setUp() {
        mergeSortedFiles = new MergeSortedFiles();
    }

    @Test
    void normalCase1() {

        List<List<Integer>> sortedArrays = List.of(
                List.of(1, 2, 3, 4, 5, 6),
                List.of(4, 5, 6, 11, 223, 2245),
                List.of(7, 573, 66666),
                List.of(0, 44)
        );
        List<Integer> result = mergeSortedFiles.mergeSortedArrays(sortedArrays);
        List<Integer> expected = List.of(1, 21, 21);
        assertNotEquals(result, expected);
    }
}