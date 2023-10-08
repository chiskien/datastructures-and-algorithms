package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next; //save the next node
            cur.next = prev; // set the first node pointer to a temp node
            prev = cur; //shifting prev to cur
            cur = temp; //shifting cur;
        }
        return prev;
    }
}
