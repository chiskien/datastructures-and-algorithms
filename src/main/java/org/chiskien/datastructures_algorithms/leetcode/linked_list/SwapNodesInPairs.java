package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class SwapNodesInPairs {

    public ListNode swapNode(ListNode head) {

        ListNode dummyHead = new ListNode(0, head);
        ListNode parent = dummyHead;
        ListNode current = head;
        ListNode adjacentNode; //node next to current

        while (current != null && current.next != null) {
            adjacentNode = current.next; //assign adjacentNode to next of current
            current.next = adjacentNode.next; //
            parent.next = adjacentNode;
            adjacentNode.next = current;
            parent = current;
            current = current.next;
        }
        return dummyHead.next;

    }
}
