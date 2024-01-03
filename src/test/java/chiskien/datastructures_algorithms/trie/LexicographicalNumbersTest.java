package chiskien.datastructures_algorithms.trie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LexicographicalNumbersTest {

    LexicographicalNumbers lexicographicalNumbers;

    @BeforeEach
    void setup() {
        lexicographicalNumbers = new LexicographicalNumbers();
    }

    @Test
    void normalCase1() {
        int n = 5;
        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        List<Integer> actual = lexicographicalNumbers.lexicalOrder(n);
        assertEquals(expected, actual);
    }

}