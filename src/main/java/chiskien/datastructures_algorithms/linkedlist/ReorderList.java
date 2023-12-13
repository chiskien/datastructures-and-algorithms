package chiskien.datastructures_algorithms.linkedlist;

import java.util.List;

public class ReorderList {

    //You are given the head of a singly linked-list. The list can be represented as:
    //L0 → L1 → … → Ln - 1 → Ln
    //Reorder the list to be on the following form:
    //L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
    //You may not modify the values in the list's nodes.
    //Only nodes themselves may be changed.
    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode root = ListNode.build(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        reorderList.reorderList(root);

    }

    public ListNode reorderList(ListNode head) {
        int size = 1;
        ListNode tail = head;
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }
        int half = size / 2;
        ListNode secondHalfListHead = head;
        while (half > 0) {
            secondHalfListHead = secondHalfListHead.next;
            half--;
        }
        ListNode newSecondHalfListHead = reverseList(secondHalfListHead);
        ListNode dummyPlaceHolder = new ListNode(0, head);
        int half2 = size / 2;
        while (half2 > 0) {
            ListNode temp = head.next;
            head.next = newSecondHalfListHead;
            newSecondHalfListHead.next = temp;
            half2--;
        }
        System.out.println(dummyPlaceHolder.next);
        return dummyPlaceHolder.next;
    }

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
