package org.chiskien.leetcode.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NearestRepeatedEntriesTest {
    NearestRepeatedEntries nearestRepeatedEntries;

    @BeforeEach
    void setUp() {
        nearestRepeatedEntries = new NearestRepeatedEntries();
    }

    @Test
    void findNearestRepetition() {
        List<String> paragraph = List.of("aaaa", "adsadsa", "aaaasdasa", "aaaaaaaaa", "sdafsadfdsa", "aaaaaaaaa");
        int result = nearestRepeatedEntries.findNearestRepetition(paragraph);
        assertEquals(result, 2);
    }
}