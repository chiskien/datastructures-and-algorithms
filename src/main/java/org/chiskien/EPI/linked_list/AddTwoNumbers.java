package org.chiskien.EPI.linked_list;

import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode test = new ListNode();
        ListNode l1 = test.build(new int[]{5, 6, 4});
        ListNode l2 = test.build(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        long base1 = 1;
        long base2 = 1;
        long num1 = 0;
        long num2 = 0;
        while (temp1 != null) {
            num1 += temp1.val * base1;
            temp1 = temp1.next;
            base1 = base1 * 10;
        }
        while (temp2 != null) {
            num2 += temp2.val * base2;
            temp2 = temp2.next;
            base2 = base2 * 10;
        }
        System.out.println(num2);
        long sum = num1 + num2;
        ListNode head = new ListNode((int) (sum % 10));
        long sum2 = sum / 10;
        ListNode n = head;
        while (sum2 >= 1) {
            long item = sum2 % 10;
            head.next = new ListNode((int) item);
            head = head.next;
            sum2 = sum2 / 10;
        }
        return n;
    }
}

