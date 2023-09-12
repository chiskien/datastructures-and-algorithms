package org.chiskien.datastructures.leetcode.hashmap;

import java.util.*;
import java.util.stream.Collectors;

//LeetCode 128
public class LongestConsecutiveSequence {

    //find the longest length of subarray that items are consecutive
    //Brute Force: Sort the array and iterate and record
    // => Care only about the integers adjacent to a given value
    // => Use HashMap

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1);
    }

    public static int longestContainedRange(int[] nums) {
        //unProcessingEntries records the existence of each entry in nums.
        Set<Integer> unProcessingEntries = new HashSet<>();
        for (int i : nums) {
            unProcessingEntries.add(i);
        }

        int maxIntervalSize = 0;
        while (!unProcessingEntries.isEmpty()) {
            int a = unProcessingEntries.iterator().next();
            unProcessingEntries.remove(a);

            //find the lower bound of the largest range containing a.
            int lowerBound = a - 1;
            while (unProcessingEntries.contains(lowerBound)) {
                unProcessingEntries.remove(lowerBound);
                --lowerBound;
            }

            //find the upper bound
            int upperBound = a + 1;
            while (unProcessingEntries.contains(upperBound)) {
                unProcessingEntries.remove(upperBound);
                ++upperBound;
            }

            maxIntervalSize = Math.max(upperBound - lowerBound - 1, maxIntervalSize);
        }
        return maxIntervalSize;
    }

}
