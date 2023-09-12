package org.chiskien.leetcode.hashmap;

import org.chiskien.datastructures.leetcode.hashmap.SmallestSubArrayCoveringAllValues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubArrayCoveringAllValuesTest {

    SmallestSubArrayCoveringAllValues s;

    @BeforeEach
    void setUp() {
        s = new SmallestSubArrayCoveringAllValues();
    }

    @Test
    void normalCase() {
        List<String> paragraph = List.of("mot", "con", "vit", "xoe", "ra", "hai", "cai", "canh");
        Set<String> keyWords = Set.of("con", "hai");
        int[] expected = new int[]{1, 5};
        int[] actual = s.findSmallestSubArrayCoveringSetOfWords(paragraph, keyWords);
        assertArrayEquals(expected, actual);
    }

    @Test
    void normalCase2() {
        List<String> paragraph = List.of("mot",
                "con", "vit", "xoe", "ra", "hai", "cai", "con", "canh", "hai", "canh");
        Set<String> keyWords = Set.of("con", "hai");
        int[] expected = new int[]{7, 9};
        int[] actual = s.findSmallestSubArrayCoveringSetOfWords(paragraph, keyWords);
        assertArrayEquals(expected, actual);
    }
}