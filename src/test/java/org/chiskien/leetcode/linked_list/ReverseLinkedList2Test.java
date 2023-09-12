package org.chiskien.leetcode.linked_list;

import org.chiskien.datastructures_algorithms.leetcode.linked_list.ListNode;
import org.chiskien.datastructures_algorithms.leetcode.linked_list.ReverseLinkedList2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedList2Test {
    ReverseLinkedList2 reverseLinkedList2;
    ListNode builder;

    @BeforeEach
    void setUp() {
        reverseLinkedList2 = new ReverseLinkedList2();
        builder = new ListNode();
    }

    @Test
    void reverseSubList1() {
        ListNode head = builder.build(new int[]{1, 2, 3, 4, 5});
        int left = 2;
        int right = 4;
        ListNode result = reverseLinkedList2.reverseBetween(head, left, right);

    }
}