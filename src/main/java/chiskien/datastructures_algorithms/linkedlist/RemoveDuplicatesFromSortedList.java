package chiskien.datastructures_algorithms.linkedlist;

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
