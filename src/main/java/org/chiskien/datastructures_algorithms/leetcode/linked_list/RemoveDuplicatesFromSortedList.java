package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummyHead = new ListNode(0, head);
        ListNode parent = dummyHead;
        ListNode current = dummyHead.next;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                parent.next = current.next;
                parent = current;
            }
            current = current.next;
        }
        return dummyHead.next;
    }
}
