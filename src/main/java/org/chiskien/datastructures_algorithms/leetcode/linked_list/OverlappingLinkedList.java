package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class OverlappingLinkedList {

    // Given two singly linked-lists
    // Reducing memory footprint as in flyweight pattern, maintain a cannonical form

    //solution: use hashtable
    //
    public ListNode overlappingNoCycleLists(ListNode l1, ListNode l2) {
        ListNode dummyL1 = l1;
        ListNode dummyL2 = l2;

        int length1 = ListNode.length(l1);
        int length2 = ListNode.length(l2);

        //Advances the longer list to get equal length lists
        if (length1 > length2) {
            dummyL1 = ListNode.advanceListByK(dummyL1, length1 - length2);
        } else {
            dummyL2 = ListNode.advanceListByK(dummyL2, length2 - length1);
        }

        while (dummyL1 != null && dummyL2 != null && dummyL2 != dummyL1) {
            dummyL1 = dummyL1.next;
            dummyL2 = dummyL2.next;
        }
        return dummyL1;
    }

}
