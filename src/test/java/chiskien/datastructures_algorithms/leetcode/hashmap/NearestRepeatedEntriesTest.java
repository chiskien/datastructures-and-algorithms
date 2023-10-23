package chiskien.datastructures_algorithms.leetcode.hashmap;

import chiskien.datastructures_algorithms.leetcode.hashmap.NearestRepeatedEntries;
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

    @Test
    void findNearestRepetition2() {
        List<String> paragraph = List.of("mot", "con", "vit", "xoe", "con", "con", "hai", "canh", "con");
        int result = nearestRepeatedEntries.findNearestRepetition(paragraph);
        assertEquals(1, result);
    }
}