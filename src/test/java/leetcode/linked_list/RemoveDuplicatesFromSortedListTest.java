package leetcode.linked_list;

import chiskien.datastructures_algorithms.leetcode.linked_list.ListNode;
import chiskien.datastructures_algorithms.leetcode.linked_list.RemoveDuplicatesFromSortedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    @Test
    void normalCase() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 3});
        ListNode expected = ListNode.build(new int[]{1, 2, 3});
        ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);
        assertEquals(expected, actual, "not equals");
    }
}