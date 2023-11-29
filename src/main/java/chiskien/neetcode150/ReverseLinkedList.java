package chiskien.neetcode150;

import chiskien.datastructures_algorithms.linkedlist.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
