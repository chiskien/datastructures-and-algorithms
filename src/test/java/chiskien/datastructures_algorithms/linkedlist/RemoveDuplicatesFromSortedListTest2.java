package chiskien.datastructures_algorithms.linkedlist;

import chiskien.datastructures_algorithms.linkedlist.ListNode;
import chiskien.datastructures_algorithms.linkedlist.RemoveDuplicatesFromSortedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest2 {
    RemoveDuplicatesFromSortedList rm;

    @BeforeEach
    void setUp() {
        rm = new RemoveDuplicatesFromSortedList();
    }

    @Test
    void deleteDuplicates() {
        ListNode head = ListNode.build(new int[]{1, 2, 2, 3, 4});
        ListNode expected = ListNode.build(new int[]{1, 2, 3, 4});
        ListNode actual = rm.deleteDuplicates(head);
        assertEquals(expected, actual);
    }
}