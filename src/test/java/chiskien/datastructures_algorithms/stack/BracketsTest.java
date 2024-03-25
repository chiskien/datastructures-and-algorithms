package chiskien.datastructures_algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    Brackets brackets;

    @BeforeEach
    void setup() {
        brackets = new Brackets();
    }

    @Test
    void normalCase1() {
        String input = "{}[](){}{}[]";
        assertTrue(brackets.isValid(input));
    }

    @Test
    void nestedBracketNormalCase2() {
        String input = "{[({[()]})]}";
        assertTrue(brackets.isValid(input));
    }

    @Test
    void nestedNotValidCase() {
        String input = "{]]]]]]]]]}";
        assertFalse(brackets.isValid(input));
    }

    @Test
    void abnormalCase() {
        String input = "";
        assertTrue(brackets.isValid(input));
    }
}