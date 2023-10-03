package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class RotateList {


    public ListNode cyclicallyRightShiftList(ListNode head, int k) {
        if (head == null) return null;

        int n = 1; //list size
        //finding tail
        ListNode tail = head;
        while (tail.next != null) {
            n++;
            tail = tail.next;
        }
        //because rotate k times is equivalent to rotate k mod n time
        k = k % n;
        if (k == 0) return head;

        //set the tail pointer to the original head
        tail.next = head;

        // the original head is becoming the kth node from the start of the new list,
        // therefore, the new head is the (n-k)th node in the original list
        int stepsToNewHead = n - k;
        ListNode newTail = tail;

        //finding newTail
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
