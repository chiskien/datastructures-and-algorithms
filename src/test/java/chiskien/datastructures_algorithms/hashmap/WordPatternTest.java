package chiskien.datastructures_algorithms.hashmap;

import chiskien.datastructures_algorithms.hashmap.WordPattern;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordPatternTest {
    WordPattern wordPattern;

    @BeforeEach
    void setUp() {
        wordPattern = new WordPattern();
    }


    @Test
    void wordPattern() {
        String pattern = "ab";
        String words = "dog cat";
        assertTrue(wordPattern.wordPattern(pattern, words));
    }

    @Test
    void wordPattern2() {
        String pattern = "aabbcc";
        String words = "dog dog cat cat chick chick";
        assertTrue(wordPattern.wordPattern(pattern, words));
    }

    @Test
    void wordPatternFalseCase1() {
        String pattern = "aabbcc";
        String words = "dog dog cat cat chick fish";
        assertFalse(wordPattern.wordPattern(pattern, words));
    }


    @Test
    void wordPattern3() {
        String pattern = "abcdabcd";
        String words = "dog cat chick fish dog cat chick fish";
        assertTrue(wordPattern.wordPattern(pattern, words));
    }

    @Test
    void wordPatternFalseCase2() {
        String pattern = "aaaaa";
        String words = "cat dog cat dog cat";
        assertFalse(wordPattern.wordPattern(pattern, words));
    }

    @Test
    void wordPatternFalseCase3() {
        String pattern = "abba";
        String words = "dog dog dog dog";
        assertFalse(wordPattern.wordPattern(pattern, words));
    }
}