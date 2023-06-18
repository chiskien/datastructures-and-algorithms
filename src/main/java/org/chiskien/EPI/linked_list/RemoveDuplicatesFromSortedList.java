package org.chiskien.EPI.linked_list;

import java.util.List;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode n = new ListNode();
        System.out.println(deleteDuplicates(n.build(new int[]{1, 2, 2, 3, 3, 4})));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode nextNode = head.next;
        ListNode prevNode = null;
        ListNode n = prevNode;
        while (nextNode != null) {
            prevNode = head;
            if (head.val == nextNode.val) {
                prevNode.next = nextNode.next;
                head = nextNode.next;
            } else {
                head = head.next;
            }
            nextNode = nextNode.next;
        }
        return n;
    }
}
