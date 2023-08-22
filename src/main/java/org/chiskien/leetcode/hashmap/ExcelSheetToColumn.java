package org.chiskien.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetToColumn {
    public static void main(String[] args) {
        System.out.println(convertToTitle(260));
    }

    public static String convertToTitle(int columnNumber) {
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
        if (columnNumber > 0) stringBuilder.append(excelCharAndIntMapping.get(columnNumber));
        return stringBuilder.reverse().toString();
    }
}
