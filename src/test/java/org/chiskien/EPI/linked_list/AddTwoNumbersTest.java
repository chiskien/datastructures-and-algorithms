package org.chiskien.EPI.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        ListNode test = new ListNode();
        ListNode l1 = test.build(new int[]{2,4,3});
        ListNode l2 = test.build(new int[]{5,6,4});
        ListNode result = test.build(new int[]{7,0,8});

    }
}