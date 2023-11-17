package chiskien.datastructures_algorithms.linkedlist;

import chiskien.datastructures_algorithms.linkedlist.ListNode;
import chiskien.datastructures_algorithms.linkedlist.RemoveDuplicatesFromSortedList;
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

        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void normalCase2() {
        ListNode head = ListNode.build(new int[]{1, 2,2,2,2, 3, 3,3,3,3,3,3});
        ListNode expected = ListNode.build(new int[]{1, 2, 3});
        ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void abnormalCase1() {
        ListNode head = ListNode.build(new int[]{-1,-2,-2,-3,-4,-5,-6});
        ListNode expected = ListNode.build(new int[]{-1, -2, -3,-4,-5,-6});
        ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertEquals(expected.toString(), actual.toString());
    }
}