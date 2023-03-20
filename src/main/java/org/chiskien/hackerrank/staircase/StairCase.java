package org.chiskien.hackerrank.staircase;

public class StairCase {
    public static void main(String[] args) {
        System.out.println(GetStairCase(10));
    }

    public static String GetStairCase(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append("*".repeat(i));
        }
        return output.toString();
    }
}
