package chiskien.datastructures_algorithms.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedList2Test {
    ReverseLinkedList2 reverseLinkedList2;

    @BeforeEach
    void setUp() {
        reverseLinkedList2 = new ReverseLinkedList2();
    }

    @Test
    void reverseSubList1() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        int left = 2;
        int right = 4;
        ListNode result = reverseLinkedList2.reverseBetween(head, left, right);

    }
}