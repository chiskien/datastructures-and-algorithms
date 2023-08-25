package org.chiskien.leetcode.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromicPermutationsTest {
    IsPalindromicPermutations isPalindromicPermutations;

    @BeforeEach
    void setUp() {
        isPalindromicPermutations = new IsPalindromicPermutations();
    }

    @Test
    void normalCase1() {
        String s = "hello";
        assertFalse(isPalindromicPermutations.canFormPalindromePermutation(s));
    }

    @Test
    void normalCase2() {
        String s = "aabbaa";
        assertTrue(isPalindromicPermutations.canFormPalindromePermutation(s));
    }

    @Test
    void emptyString() {
        String s = "";
        assertTrue(isPalindromicPermutations.canFormPalindromePermutation(s));
    }

    @Test
    void normalCase3() {
        String s = "letttttttttttttttttttttttttel";
        assertTrue(isPalindromicPermutations.canFormPalindromePermutation(s));
    }
}