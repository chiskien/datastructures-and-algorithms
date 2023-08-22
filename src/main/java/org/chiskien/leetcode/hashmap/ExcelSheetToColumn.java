package org.chiskien.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetToColumn {
    public static void main(String[] args) {
        System.out.println(convertToTitle(7000));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Character> excelCharAndIntMapping = new HashMap<>();
        char label = 'A';
        for (int i = 1; i <= 26; i++) {
            excelCharAndIntMapping.put(i, label);
            label++;
        }
        while (columnNumber != 0 ) {
            int a = columnNumber / 26;
            int b = columnNumber % 26;
            if (a == 0) {
                stringBuilder.append(excelCharAndIntMapping.get(b));
            } else {
                stringBuilder.append(excelCharAndIntMapping.get(a));
            }
            columnNumber = a;
        }
        return stringBuilder.toString();
    }
}
