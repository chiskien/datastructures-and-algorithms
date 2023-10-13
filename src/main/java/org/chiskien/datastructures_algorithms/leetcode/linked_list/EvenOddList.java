package org.chiskien.datastructures_algorithms.leetcode.linked_list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenOddList {

    public ListNode evenOddMerge(ListNode head) {
        if (head == null) return head;
        ListNode evenDummyHead = new ListNode(0, null);
        ListNode oddDummyHead = new ListNode(0, null);

        List<ListNode> tails = Arrays.asList(evenDummyHead, oddDummyHead);
        int turn = 0;
        ListNode iter = head;
        while (iter != null) {
            tails.get(turn).next = iter;
            tails.set(turn, tails.get(turn).next);
            turn ^= 1;
            iter = iter.next;
        }
        tails.get(1).next = null;
        tails.get(0).next = oddDummyHead.next;
        return evenDummyHead.next;
    }
}
