package chiskien.datastructures_algorithms.leetcode.hashmap;

import chiskien.datastructures_algorithms.leetcode.hashmap.WordPattern;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WordPatternTest {
    WordPattern wordPattern;

    @BeforeEach
    void setUp() {
        wordPattern = new WordPattern();
    }

    @Test
    void wordPattern() {
        String pattern = "aaaa";
        String s = "b b b b";
        assertTrue(WordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern2() {
        String pattern = "aabbccdd";
        String s = "cac cac buoi buoi lon lon bim bim";
        assertTrue(WordPattern.wordPattern(pattern, s));
    }

    @Test
    void wordPattern3() {
        String pattern = "abba";
        String s = "dog dog dog dog";
        assertTrue(WordPattern.wordPattern(pattern, s));
    }
}