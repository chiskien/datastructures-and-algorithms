package org.chiskien.datastructures_algorithms.leetcode.hashmap;

import java.util.*;

//LeetCode 128
public class LongestConsecutiveSequence {

    //find the longest length contains items are consecutive ordered
    //Brute Force: Sort the array and iterate and record
    // => Care only about the integers adjacent to a given value
    // => Use HashMap

    // 1. Add elements to Hash Table (using LinkedHashset or HashSet)
    // Iterate through the Hash Table
    // With element E in Hash Table, find the largest contigous sequence from that element
    // backward or forward in Hash Table
    // We find e - 1, e- 2, ... , e + 1, e + 2 if them in hash table or not
    // To avoid duplicate, remove it from hash table, because if when we find it again, it just a same sequence.

    public int longestContainedRange(int[] nums) {
        Set<Integer> unprocessedElements = new HashSet<>(nums.length);
        for (Integer num : nums) {
            unprocessedElements.add(num);
        }
        int maxIntervalSize = 0;
        while (!unprocessedElements.isEmpty()) {
            Integer element = unprocessedElements.iterator().next();
            //visited and then remove from hash table
            unprocessedElements.remove(element);

            //find the lower bound of the largest range containing integer
            int lowerBound = element - 1;
            while (unprocessedElements.contains(lowerBound)) {
                unprocessedElements.remove(lowerBound);
                --lowerBound;
            }
            //find the upper bound of the largest range containing integer
            int upperBound = element + 1;
            while (unprocessedElements.contains(upperBound)) {
                unprocessedElements.remove(upperBound);
                ++upperBound;
            }
            maxIntervalSize = Math.max(upperBound - lowerBound - 1, maxIntervalSize);
        }

        return maxIntervalSize;
    }

}
