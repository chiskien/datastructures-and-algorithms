package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //Compare first half and the reversed second half lists
        return false;
    }
}
