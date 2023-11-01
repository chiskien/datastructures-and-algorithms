package chiskien.datastructures_algorithms.leetcode.linkedlist.practice;

import chiskien.datastructures_algorithms.leetcode.linkedlist.ListNode;

public class ReverseSingleSublist {
    public ListNode reverseSubList(ListNode head, int start, int finish) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode nodePointedToHeadOfReversedSublist = dummyHead;
        int i = 1;
        while (i++ < start) {
            nodePointedToHeadOfReversedSublist =
                    nodePointedToHeadOfReversedSublist.next;
        }

        //nodePointedToHeadOfReversedSublist now is at the (start-1)th node
        ListNode headOfReversedSublist = nodePointedToHeadOfReversedSublist.next;
        int j = start;
        while (j < finish) {
            ListNode temp = headOfReversedSublist.next;
            headOfReversedSublist.next = temp.next;
            temp.next = nodePointedToHeadOfReversedSublist.next;
            nodePointedToHeadOfReversedSublist.next = temp;
            j++;
        }
        return dummyHead.next;
    }
}
