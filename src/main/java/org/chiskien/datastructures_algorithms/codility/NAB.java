package org.chiskien.datastructures_algorithms.codility;

import java.util.*;


public class NAB {

    public static int longestSymmetricSubstring(String s) {
        // Check if the string is empty or has only one character.
        char[] strArray = s.toCharArray();
        return 0;
    }

    public static int task1(String S) {
        int len = S.length();
        int count = 1;
        int result = 0;
        for (int i = 1; i < len; i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                if (count >= 3) {
                    result += count / 3;
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count >= 3) {
            result += count / 3;
        }

        return result;
    }

    public static int task2(int[][] A) {
        // Create a map to store the doctors and their work locations.
        Map<Integer, Set<Integer>> doctors = new HashMap<>();
        // Iterate through the matrix and add each doctor to the map.
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int doctorId = A[i][j];
                if (!doctors.containsKey(doctorId)) {
                    doctors.put(doctorId, new HashSet<>());
                }
                doctors.get(doctorId).add(i);
            }
        }
        // Count the number of doctors who work at more than one hospital.
        int count = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : doctors.entrySet()) {
            if (entry.getValue().size() > 1) {
                count++;
            }
        }
        return count;
    }
}
