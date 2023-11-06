package chiskien.datastructures_algorithms.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateListTest {
    ListNode helper;
    RotateList rotateList;

    @BeforeEach
    void setUp() {
        helper = new ListNode();
        rotateList = new RotateList();
    }

    @Test
    void cyclicallyRightShiftList() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode n = rotateList.cyclicallyRightShiftList(head, k);
    }
}