package chiskien.datastructures_algorithms.practices;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {


    //give an array, return the length of the longest sequence
    // input: [1,2,41,41,5,66,61,21223,]
    public int lengthOfTheLongestSequence(int[] nums) {
        int maxLength = 0;
        Set<Integer> elementsSet = new HashSet<>();
        for (int num : nums) {
            elementsSet.add(num);
        }
        for (int num : nums) {
            if (elementsSet.contains(num)) {
                elementsSet.remove(num);
                int upperBound = num + 1;
                while (elementsSet.contains(upperBound)) {
                    elementsSet.remove(upperBound);
                    upperBound++;
                }
                int lowerBound = num - 1;
                while (elementsSet.contains(lowerBound)) {
                    elementsSet.remove(lowerBound);
                    lowerBound--;
                }
                int internalLength = upperBound - lowerBound - 1;
                maxLength = Math.max(maxLength, internalLength);

            }
        }
        return maxLength;
    }
}
