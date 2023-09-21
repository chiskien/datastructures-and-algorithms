package org.chiskien.datastructures_algorithms.leetcode.hashmap;

import org.chiskien.datastructures_algorithms.leetcode.hashmap.ExcelSheetToColumn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetToColumnTest {

    ExcelSheetToColumn excelSheetToColumn;

    @BeforeEach
    void setUp() {
        excelSheetToColumn = new ExcelSheetToColumn();
    }

    @Test
    void normalCaseWithZeroToNine() {
        int columnNumber = 3;
        assertEquals("C", ExcelSheetToColumn.convertToTitleCK(columnNumber));
    }

    @Test
    void normalCaseWithZeroToNine2() {
        int columnNumber = 9;
        assertEquals("I", ExcelSheetToColumn.convertToTitleCK(columnNumber));
    }
    @Test
    void normalCaseWithTwoDigits() {
        int columnNumber = 701;
        assertEquals("Z", ExcelSheetToColumn.convertToTitleCK(columnNumber));
    }
}