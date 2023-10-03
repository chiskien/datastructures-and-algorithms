package org.chiskien.datastructures_algorithms.leetcode.linked_list.practice;

import org.chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;
import org.chiskien.datastructures_algorithms.leetcode.linked_list.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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