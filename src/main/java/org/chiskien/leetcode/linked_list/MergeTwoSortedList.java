package org.chiskien.leetcode.linked_list;

public class MergeTwoSortedList {


    public static ListNode mergeTwoListNode(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode current = head;
        ListNode n1 = l1, n2 = l2;
        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                current.next = n1;
                n1 = n1.next;
            } else {
                current.next = n2;
                n2 = n2.next;
            }
            current = current.next;
        }

        //append remainning node
        if (n1 != null) {
            current.next = n1;
        } else {
            current.next = n2;
        }
        return head.next;
    }
}
