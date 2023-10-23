package chiskien.datastructures_algorithms.leetcode.intervals;

import chiskien.datastructures_algorithms.leetcode.intervals.SummaryRanges;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {
    SummaryRanges summaryRanges;

    @BeforeEach
    void setUp() {
        summaryRanges = new SummaryRanges();
    }

    @Test
    void normalCase1() {
        int[] nums = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 22};
        List<String> expected = List.of("1->4", "6->9", "22");
        assertEquals(expected, summaryRanges.summaryRanges(nums));
    }
    @Test
    void normalCase2() {
        int[] nums = new int[]{0,2,3,4,6,8,9};
        List<String> expected = List.of("0", "2->4", "6", "8->9");
        assertEquals(expected, summaryRanges.summaryRanges(nums));
    }

    @Test
    void normalCase3() {
        int[] nums = new int[]{1,2,3,5,8,10,20,40,41,42,43};
        List<String> expected = List.of(
                "1->3", "5","8", "10","20" ,"40->43");
        assertEquals(expected, summaryRanges.summaryRanges(nums));
    }


}