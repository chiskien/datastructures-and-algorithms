package org.chiskien.leetcode.linked_list;

public class RemoveDuplicatesFromSortedList {



    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode previous = dummyHead;
        ListNode current = head; //head
        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            if (previous.next == current) {
                previous = previous.next;
            } else {
                previous.next = current.next;
            }
            current = current.next;
        }
        return dummyHead.next;
    }
}
