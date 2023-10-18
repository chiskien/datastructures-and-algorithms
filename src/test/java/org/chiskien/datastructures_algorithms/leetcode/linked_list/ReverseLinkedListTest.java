package org.chiskien.datastructures_algorithms.leetcode.linked_list;

import chiskien.datastructures_algorithms.leetcode.linked_list.ListNode;
import chiskien.datastructures_algorithms.leetcode.linked_list.ReverseLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void reverseList() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.build(new int[]{5, 4, 3, 2, 1});
        ListNode actual = reverseLinkedList.reverseList(head);
        assertEquals(expected, actual);
    }
}