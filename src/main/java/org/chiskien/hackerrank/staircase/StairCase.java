package org.chiskien.hackerrank.staircase;

public class StairCase {

    public static String GetStairCase(int n) {
        StringBuilder output = new StringBuilder();
        FIRST_ROW:
        for (int i = 0; i < n; i++) {
            SECOND_ROW:
            for (int j = 0; j < i; j++) {
                output.append("*");
            }
        }
        return output.toString();
    }
}
