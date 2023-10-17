package org.chiskien.datastructures_algorithms.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetToColumn {

    public String convertToTitleCleaner(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber-- > 0) {
            char c = (char) (columnNumber % 26 + 'A');
            columnNumber = columnNumber / 26;
            result.append(c);
        }
        return result.reverse().toString();
    }

    public int convertColumnToNumber(String column) {
        int result = 0;
        for (int i = 0; i < column.length(); i++) {
            char c = column.charAt(i);
            result = result * 26 + c - 'A' + 1;
        }
        return result;
    }

    public String convertToTitleCK(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Character> excelCharAndIntMapping = new HashMap<>();
        char label = 'A';
        for (int i = 1; i <= 26; i++) {
            excelCharAndIntMapping.put(i, label);
            label++;
        }
        while (columnNumber > 26) {
            int a = columnNumber / 26;
            int b = columnNumber % 26;
            if (b == 0) {
                b = 26;
                a -= 1;
            }
            stringBuilder.append(excelCharAndIntMapping.get(b));
            columnNumber = a;
        }
        if (columnNumber > 0)
            stringBuilder.append(excelCharAndIntMapping.get(columnNumber));
        return stringBuilder.reverse().toString();
    }
}
