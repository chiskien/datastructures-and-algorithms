package org.chiskien.leetcode.linked_list;

import org.chiskien.datastructures.leetcode.linked_list.ListNode;
import org.chiskien.datastructures.leetcode.linked_list.RotateList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateListTest {
    ListNode helper;
    RotateList rotateList;

    @BeforeEach
    void setUp() {
        helper = new ListNode();
        rotateList = new RotateList();
    }

    @Test
    void cyclicallyRightShiftList() {
        ListNode head = helper.build(new int[]{1, 2, 3, 4, 5});
        int k = 2;
        ListNode n =  rotateList.cyclicallyRightShiftList(head, k);
        System.out.println(n);
    }
}