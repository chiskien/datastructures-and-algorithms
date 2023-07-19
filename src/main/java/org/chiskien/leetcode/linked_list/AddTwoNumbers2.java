package org.chiskien.leetcode.linked_list;

import java.math.BigInteger;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        ListNode n = new ListNode();
        ListNode l1 = n.build(new int[]{3, 9, 9, 9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = n.build(new int[]{2, 9, 5});
    }
//    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
//        BigInteger num1 = BigInteger.valueOf(0), num2 = BigInteger.valueOf(0);
//        int l1Size = 1, l2Size = 1;
//        BigInteger base1 = BigInteger.valueOf(1), base2 = BigInteger.valueOf(1);
//        ListNode dummyL1 = l1;
//        ListNode dummyL2 = l2;
//        while (dummyL1.next != null) {
//            l1Size++;
//            base1 = base1.multiply(BigInteger.valueOf(10));
//            dummyL1 = dummyL1.next;
//        }
//        while (dummyL2.next != null) {
//            l2Size++;
//            base2 = base2.multiply(BigInteger.valueOf(10));
//            dummyL2 = dummyL2.next;
//        }
//        ListNode fakeL1 = l1;
//        while (l1Size >= 1 && fakeL1 != null) {
//            num1 = num1.add(BigInteger.valueOf(fakeL1.val).multiply(base1));
//            base1 = base1.divide(BigInteger.valueOf(10));
//            fakeL1 = fakeL1.next;
//        }
//
//        ListNode fakeL2 = l2;
//        while (l2Size >= 1 && fakeL2 != null) {
//            num2 = num2.add(BigInteger.valueOf(fakeL2.val).multiply(base2));
//            base2 = base2.divide(BigInteger.valueOf(10));
//            fakeL2 = fakeL2.next;
//        }
//        BigInteger sum = num1.add(num2);
//        String temp = sum.toString();
//        int[] list = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++) {
//            list[i] = temp.charAt(i) - '0';
//        }
//        ListNode head = new ListNode(list[0]);
//        ListNode n = head;
//        for (int i = 1; i < list.length; i++) {
//            head.next = new ListNode(list[i]);
//            head = head.next;
//        }
//        return n;
//
//    }
}
