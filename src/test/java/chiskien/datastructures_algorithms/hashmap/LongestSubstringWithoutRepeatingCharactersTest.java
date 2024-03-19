package chiskien.datastructures_algorithms.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void normalCase() {
        String s = "abcdecghbcaa";
        int actual = longestSubstringWithoutRepeatingCharacters.longestSubstring(s);
        assertEquals(actual, s.length());
    }

    @Test
    void normalCase2() {
        String s = "aab";
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.longestSubstring(s));
    }

    @Test
    void abnormalCase1() {
        String s = " ";
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.longestSubstring(s));
    }

    @Test
    void abnormalCase2() {
        String s = "aaaaaaa";
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.longestSubstring(s));
    }

    @Test
    void abnormalCase3() {
        String s = "";
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.longestSubstring(s));
    }
    @Test
    void abnormalCase4() {
        String s = "12211321312312";
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.longestSubstring(s));
    }
}