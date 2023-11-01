package chiskien.datastructures_algorithms.leetcode.linkedlist;

public class PartitionList {
    // also known as list pivoting
    public ListNode partition(ListNode head, int x) {
        //organize a list into:
        // all nodes < x must come before nodes greater or equal x
        // must preserve the original order of a list
        ListNode dummyLessHead = new ListNode(0, null);
        ListNode dummyGreaterHead = new ListNode(0, null);
        ListNode lessIter = dummyLessHead;
        ListNode greaterIter = dummyGreaterHead;

        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                lessIter.next = current;
                lessIter = current;
            } else {
                greaterIter.next = current;
                greaterIter = current;
            }
            current = current.next;
        }
        greaterIter.next = null;
        lessIter.next = dummyGreaterHead.next;

        return dummyLessHead.next;
    }
}
