package org.chiskien.leetcode.hashmap;

import java.util.*;

//13.10 EPI
//LeetCode 128
public class LongestConsecutiveSequence {
    //find the longest length of subarray that items are consecutive
    //Brute Force: Sort the array and iterate and record
    // => Care only about the integers adjacent to a given value
    // => Use HashMap


    //region oldCode
    //    public int longestConsecutiveSequence(int[] nums) {
//        Set<Integer> unprocessedEntries = new HashSet<>();
//        for (Integer i : nums) {
//            unprocessedEntries.add(i);
//        }
//        int maxIntervalSize = 0;
//        while (!unprocessedEntries.isEmpty()) {
//            int a = unprocessedEntries.iterator().next();
//            unprocessedEntries.remove(a);
//
//            //Finds the lower bound of the largest range containing a
//            int lowerBound = a - 1;
//            while (unprocessedEntries.contains(lowerBound)) {
//                unprocessedEntries.remove(lowerBound);
//                --lowerBound;
//            }
//
//            //Finds the upper bound of the largest range containing a
//            int upperBound = a + 1;
//            while (unprocessedEntries.contains(upperBound)) {
//                unprocessedEntries.remove(upperBound);
//                ++upperBound;
//            }
//            maxIntervalSize = Math.max(upperBound - lowerBound - 1, maxIntervalSize);
//        }
//        return maxIntervalSize;
//    }
    //endregion
}
