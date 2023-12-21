package chiskien.datastructures_algorithms.dynamicprogramming;

import java.util.Arrays;

public class ComputeTheLevenshteinDistance {

    //Spell Checker
    public int levenshteinDistance(String start, String end) {
        int[][] distancesBetweenPrefixes = new int[start.length()][end.length()];
        for (int[] row : distancesBetweenPrefixes) {
            Arrays.fill(row, -1);
        }
        return computeDistanceBetweenPrefixes(start, start.length() - 1, end, end.length() - 1, distancesBetweenPrefixes);
    }

    private int computeDistanceBetweenPrefixes(String prefix1, int firstIndex, String prefix2, int secondIndex, int[][] distanceBetweenPrefixes) {

        if (firstIndex < 0) {
            //prefix1 is empty
            return secondIndex + 1;
        } else if (secondIndex < 0) {
            return firstIndex + 1;
        }
        if (distanceBetweenPrefixes[firstIndex][secondIndex] == -1) {
            if (prefix1.charAt(firstIndex) == prefix2.charAt(secondIndex)) {
                distanceBetweenPrefixes[firstIndex][secondIndex] = computeDistanceBetweenPrefixes(prefix1, firstIndex - 1, prefix2, secondIndex - 1, distanceBetweenPrefixes);
            } else {
                int substituteLast = computeDistanceBetweenPrefixes(prefix1, firstIndex - 1, prefix2, secondIndex - 1, distanceBetweenPrefixes);
                int addLast = computeDistanceBetweenPrefixes(prefix1, firstIndex, prefix2, secondIndex - 1, distanceBetweenPrefixes);
                int deleteLast = computeDistanceBetweenPrefixes(prefix1, firstIndex - 1, prefix2, secondIndex, distanceBetweenPrefixes);
                distanceBetweenPrefixes[firstIndex][secondIndex] = 1 + Math.min(substituteLast, Math.min(addLast, deleteLast));
            }
        }
        return distanceBetweenPrefixes[firstIndex][secondIndex];

    }
}
