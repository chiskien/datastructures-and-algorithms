package org.chiskien.datastructures_algorithms.leetcode.linked_list.practice;

import org.chiskien.datastructures_algorithms.leetcode.linked_list.ListNode;

class MergeTwoLinkedList {

    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode dummyL1 = l1;
        ListNode dummyL2 = l2;

        //place holder for result
        ListNode dummyHead = new ListNode(0, null);
        //iterator pointer
        ListNode current = dummyHead;
        while (dummyL1 != null && dummyL2 != null) {
            if (dummyL1.val <= dummyL2.val) {
                current.next = dummyL1;
                dummyL1 = dummyL1.next;
            } else {
                current.next = dummyL2;
                dummyL2 = dummyL2.next;
            }
            current = current.next;
        }
        current.next = dummyL1 != null ? dummyL1 : dummyL2;
        return dummyHead.next;

    }
}
