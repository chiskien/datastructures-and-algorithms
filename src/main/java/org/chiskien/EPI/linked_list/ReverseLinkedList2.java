package org.chiskien.EPI.linked_list;

public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;
        ListNode dummyHead = new ListNode(0, head); //Dummy node to pointer to head
        ListNode subListHead = dummyHead;
        int k = 1;
        //find node at left
        while (k++ < left) {
            subListHead = subListHead.next;
        }
        ListNode sublistIter = subListHead.next;
        while (left++ < right) {
            ListNode temp = sublistIter.next;
            sublistIter.next = temp.next;
            temp.next = subListHead.next;
            subListHead.next = temp;
        }
        return dummyHead.next;
    }
}
