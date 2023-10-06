package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode nextNode;
        while (current != null && current.next != null) {
            nextNode = current.next;
            while (nextNode != null && current.val == nextNode.val) {
                current.next = nextNode.next;
                nextNode = nextNode.next;
            }
            current = nextNode;
        }
        return head;
    }
}
