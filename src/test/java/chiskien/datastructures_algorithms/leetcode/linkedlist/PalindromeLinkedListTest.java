package chiskien.datastructures_algorithms.leetcode.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    void setUp() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    void isPalindrome() {
        ListNode head = ListNode.build(new int[]{1, 2, 2, 1});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void emptyList() {
        ListNode head = ListNode.build(new int[]{});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void oneNode() {
        ListNode head = ListNode.build(new int[]{1});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void sameNode() {
        ListNode head = ListNode.build(new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void normalCase2() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 3, 2, 1});
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void normalCase3() {
        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 3, 2, 22});
        assertFalse(palindromeLinkedList.isPalindrome(head));
    }
}