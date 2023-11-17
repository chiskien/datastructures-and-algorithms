package chiskien.datastructures_algorithms.linkedlist;

public class RemoveLinkedListElement {

    public ListNode removeLinkedList(ListNode head, int k) {
        //remove nodes have val equals to k
        ListNode dummyHead = new ListNode(0, head);
        ListNode parent = dummyHead;
        ListNode current = head;
        while (current != null) {
            if (current.val == k) {
                while (current != null && current.val == k) {
                    parent.next = current.next;
                    current = current.next;
                }
            } else {
                parent = current;
                current = current.next;
            }
        }
        return dummyHead.next;
    }
}
