package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class ReverseLinkedList2 {


    //reverse a sublist within a range
    public ListNode reverseBetween(ListNode head, int first, int last) {
        if (first == last) return head;
        ListNode dummyHead = new ListNode(0, head); //Dummy node to pointer to head
        ListNode subListHead = dummyHead;
        int k = 1;
        //find node at first
        while (k++ < first) {
            subListHead = subListHead.next;
        }
        ListNode sublistIter = subListHead.next;
        int i = first;
        while (i++ < last) {
            ListNode temp = sublistIter.next;
            sublistIter.next = temp.next;
            temp.next = subListHead.next;
            subListHead.next = temp;
        }
        return dummyHead.next;
    }
}
