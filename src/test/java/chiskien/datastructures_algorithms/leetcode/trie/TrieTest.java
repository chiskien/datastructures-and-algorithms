package chiskien.datastructures_algorithms.leetcode.trie;

import chiskien.datastructures_algorithms.leetcode.trie.Trie;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {
    Trie root;

    @BeforeEach
    void setUp() {
        root = new Trie();
    }

    @AfterEach
    void tearDown() {
        root = new Trie();
        System.gc();
    }

    @Test
    void testSearchInTrie() {
        String word = "abcdee";
        root.insert(word);
        assertTrue(root.search(word));
    }
    @Test
    void testSearchFailInTrie() {
        String word = "abcdee";
        root.insert(word);
        assertFalse(root.search("abc"));
    }
    @Test
    void testStartWith() {
        String word = "abcdee";
        root.insert(word);
        assertTrue(root.startsWith("abc"));
    }
}