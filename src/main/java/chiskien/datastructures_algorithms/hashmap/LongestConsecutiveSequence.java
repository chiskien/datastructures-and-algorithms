package chiskien.datastructures_algorithms.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        Set<Integer> unprocessedElements = HashSet.newHashSet(nums.length);
        for (Integer num : nums) {
            unprocessedElements.add(num);
        }
        int maxIntervalSize = 0;
        for (int num : nums) {
            if (unprocessedElements.contains(num)) {
                unprocessedElements.remove(num);

                int lowerBound = num - 1;
                while (unprocessedElements.contains(lowerBound)) {
                    unprocessedElements.remove(lowerBound);
                    lowerBound--;
                }

                int upperBound = num + 1;
                while (unprocessedElements.contains(upperBound)) {
                    unprocessedElements.remove(upperBound);
                    upperBound++;
                }

                int intervalSize = upperBound - lowerBound - 1;
                maxIntervalSize = Math.max(intervalSize, maxIntervalSize);
            }
        }

        return maxIntervalSize;
    }

}
