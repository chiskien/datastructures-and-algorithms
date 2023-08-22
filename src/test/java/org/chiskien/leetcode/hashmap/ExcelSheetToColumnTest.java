package org.chiskien.leetcode.hashmap;

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
        assertEquals("C", excelSheetToColumn.convertToTitle(columnNumber));
    }

    @Test
    void normalCaseWithZeroToNine2() {
        int columnNumber = 9;
        assertEquals("I", excelSheetToColumn.convertToTitle(columnNumber));
    }
    @Test
    void normalCaseWithTwoDigits() {
        int columnNumber = 701;
        assertEquals("Z", excelSheetToColumn.convertToTitle(columnNumber));
    }
}