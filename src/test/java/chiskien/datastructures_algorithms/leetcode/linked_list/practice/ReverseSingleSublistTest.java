package chiskien.datastructures_algorithms.leetcode.linked_list.practice;

import chiskien.datastructures_algorithms.leetcode.linked_list.ListNode;
import chiskien.datastructures_algorithms.leetcode.linked_list.practice.ReverseSingleSublist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseSingleSublistTest {
    ListNode builder;
    ReverseSingleSublist reverseSingleSublist;

    @BeforeEach
    void setUp() {
        builder = new ListNode();
        reverseSingleSublist = new ReverseSingleSublist();
    }

    @Test
    void reverseSubList() {
        ListNode head = builder.build(new int[]{1,2,3,4});
        reverseSingleSublist.reverseSubList(head, 2,4);
    }
}