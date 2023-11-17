package chiskien.datastructures_algorithms.linkedlist;

public class RemoveKthLastElement {

    public ListNode removeKthLastNode(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode current = head;
        int i = k;

        //find the kth node
        while (i-- > 0) {
            current = current.next;
        }

        //find the
        ListNode previous = dummyHead;
        while (current != null) {
            previous = previous.next;
            current = current.next;
        }
        previous.next = previous.next.next;
        return dummyHead.next;
    }

}
