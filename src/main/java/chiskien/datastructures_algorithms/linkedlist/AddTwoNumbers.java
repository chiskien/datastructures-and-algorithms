package chiskien.datastructures_algorithms.linkedlist;

public class AddTwoNumbers {


    //time complexity: O(n+m)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyL1 = l1;
        ListNode dummyL2 = l2;
        ListNode dummyHead = new ListNode(0, null);
        ListNode placeIter = dummyHead;
        int carry = 0;
        while (dummyL1 != null || dummyL2 != null) {
            int sum = carry;
            if (dummyL1 != null) {
                sum += dummyL1.val;
                dummyL1 = dummyL1.next;
            }
            if (dummyL2 != null) {
                sum += dummyL2.val;
                dummyL2 = dummyL2.next;
            }
            placeIter.next = new ListNode(sum % 10, null);
            carry = sum / 10;
            placeIter = placeIter.next;
        }
        if (carry > 0) {
            placeIter.next = new ListNode(carry, null);
        }
        return dummyHead.next;
    }
}

