package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class OverlappingLinkedListHasCycle {
    ContainCyclicity containCyclicity = new ContainCyclicity();
    OverlappingLinkedList overlappingLinkedList = new OverlappingLinkedList();

    public ListNode overlappingLists(ListNode l1, ListNode l2) {

        ListNode root1 = containCyclicity.detectCycle(l1);
        ListNode root2 = containCyclicity.detectCycle(l2);
        if (root2 == null && root1 == null) {
            //Both lists don't have a cycle inside
            return overlappingLinkedList.overlappingNoCycleLists(l1, l2);
        } else if (root1 == null || root2 == null) {
            //one list has cycle, other doesn't
            return null;
        }
        ListNode temp = root2;
        do {
            temp = temp.next;
        } while (temp != root1 && temp != root2);

        if (temp != root1) {
            return null; //cycles are  disjoint
        }

        int distanceBetweenHeadAndOverlappingNode1 = ListNode.distance(l1, root1);
        int distanceBetweenHeadAndOverlappingNode2 = ListNode.distance(l2, root2);

        if (distanceBetweenHeadAndOverlappingNode1 > distanceBetweenHeadAndOverlappingNode2) {
            l1 = ListNode.advanceListByK(l1,
                    distanceBetweenHeadAndOverlappingNode1 - distanceBetweenHeadAndOverlappingNode2);
        } else {
            l2 = ListNode.advanceListByK(l2,
                    distanceBetweenHeadAndOverlappingNode2 - distanceBetweenHeadAndOverlappingNode1);
        }
        while (l1 != l2 && l1 != root1 && l2 != root2) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1 == l2 ? l1 : root1;
    }


}
