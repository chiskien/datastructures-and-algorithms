package org.chiskien.EPI.linked_list;

import java.util.List;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode n = new ListNode();
        System.out.println(deleteDuplicates(n.build(new int[]{1, 1, 1, 2, 3})));
    }

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
