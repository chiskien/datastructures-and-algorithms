package leetcode.array;

import chiskien.datastructures_algorithms.leetcode.array.JumpGame2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame2Test {
    JumpGame2 jumpGame2;

    @BeforeEach
    void setUp() {
        jumpGame2 = new JumpGame2();
    }

    @Test
    void minimumJumpToLast() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int minimumNumber = jumpGame2.minimumJumpToLast(nums);
        assertEquals(2, minimumNumber);
    }

    @Test
    void minimumJumpToLast2() {
        int[] nums = new int[]{ 1, 3, 1, 1, 2, 3, 5, 7, 8};
        int minimumNumber = jumpGame2.minimumJumpToLast(nums);
        assertEquals(4, minimumNumber);
    }
    @Test
    void minimumJumpToLast3() {
        int[] nums = new int[]{1,2,1,1,1};
        int minimumNumber = jumpGame2.minimumJumpToLast(nums);
        assertEquals(3, minimumNumber);
    }
    @Test
    void minimumJumpToLast4() {
        int[] nums = new int[]{7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        int minimumNumber = jumpGame2.minimumJumpToLast(nums);
        assertEquals(2, minimumNumber);
    }
}