package chiskien.datastructures_algorithms.leetcode.hashmap;

import chiskien.datastructures_algorithms.leetcode.hashmap.IsomorphicStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {
    IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    @Test
    void isIsomorphic() {
        String s = "aaabbb";
        String t = "ccceee";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    void isIsomorphic2() {
        String s = "paper";
        String t = "title";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    void isIsomorphic3() {
        String s = "love";
        String t = "save";
        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }
}