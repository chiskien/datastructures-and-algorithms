package chiskien.datastructures_algorithms.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(expected.toString(), actual.toString());
    }
}