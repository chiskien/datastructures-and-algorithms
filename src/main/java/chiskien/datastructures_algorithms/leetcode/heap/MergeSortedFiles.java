package chiskien.datastructures_algorithms.leetcode.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedFiles {


    //Given 500 sortedArrays, each file contains stock information for an S&P 500 company.
    //A line encodes each trade in the following format: 12311, AAPL, 30, 456.12
    //First number is the time of the trade expressed as the number of milliseconds since the start of the day's trading

    //Write a program that takes as input a set of sorted sequences
    // and computes the union of these sequences as a sorted sequence.
    // For example, if the input is (3,5,7), (0,6), and (0,6, 28), then the output is (0, 0,3,5,6,6,7, 28).


    //Brute-force approach: Merge into 1 array and use Arrays.sort()
    //Time complexity: O(nlogn) (Default quick sort)

    private static class Entry {
        public Integer index;
        public Integer value;

        public Entry(Integer index, Integer value) {
            this.index = index;
            this.value = value;
        }
    }

    public List<Integer> mergeSortedFiles(List<List<Integer>> sortedArrays) {
        //all elements in sortedArrays are sorted
        List<Entry> entries = new ArrayList<>();
        PriorityQueue<Entry> minHeap = new PriorityQueue<>(sortedArrays.size(),
                Comparator.comparingInt(o -> o.value));

        // Initialize the minHeap with the first element from each array
        for (int i = 0; i < sortedArrays.size(); i++) {
            List<Integer> array = sortedArrays.get(i);
            if (!array.isEmpty()) {
                entries.add(new Entry(i, array.get(0)));
                minHeap.add(new Entry(i, array.get(0)));
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            Entry headEntry = minHeap.poll();
            result.add(headEntry.value);

            int arrayIndex = headEntry.index;
            int nextIndex = entries.get(arrayIndex).index + 1;

            if (nextIndex < sortedArrays.get(arrayIndex).size()) {
                Entry nextEntry = new Entry(arrayIndex,
                        sortedArrays.get(arrayIndex).get(nextIndex));
                entries.set(arrayIndex, nextEntry);
                minHeap.add(nextEntry);
            }
        }

        return result;
    }
}
