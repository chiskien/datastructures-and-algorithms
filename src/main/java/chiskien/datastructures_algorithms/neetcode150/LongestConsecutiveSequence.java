package chiskien.datastructures_algorithms.neetcode150;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longest(int[] nums) {
        Set<Integer> unprocessedEntries = new HashSet<>(nums.length);
        for (int num : nums) {
            unprocessedEntries.add(num);
        }
        int maxSequenceLength = 0;
        for (int num : nums) {
            if (unprocessedEntries.contains(num)) {
                unprocessedEntries.remove(num);
                int lowerBound = num - 1;
                while (unprocessedEntries.contains(lowerBound)) {
                    unprocessedEntries.remove(lowerBound);
                    lowerBound--;
                }
                int upperBound = num + 1;
                while (unprocessedEntries.contains(upperBound)) {
                    unprocessedEntries.remove(upperBound);
                    upperBound++;
                }
                int sequenceLength = upperBound - lowerBound - 1;
                maxSequenceLength = Math.max(sequenceLength, maxSequenceLength);
            }
        }
        return maxSequenceLength;
    }
}
