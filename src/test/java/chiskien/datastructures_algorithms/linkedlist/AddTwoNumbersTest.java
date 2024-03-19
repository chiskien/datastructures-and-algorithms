package chiskien.datastructures_algorithms.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = ListNode.build(new int[]{2, 4, 3});
        ListNode l2 = ListNode.build(new int[]{5, 6, 4});
        ListNode result = ListNode.build(new int[]{7, 0, 8});
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals(addTwoNumbers.addTwoNumbers(l1, l2), result);
    }
}