package chiskien.datastructures_algorithms.searching;

public class SearchForEntryEqualToItsIndex {


    //Design an algorithm that takes a sorted array of distinct integers, and returns an index i such as the element at index i equals i
    //Example: [-2,0,2,3,6,7,9] -> return [2,3]

    //Brute-force approach: iterate throught array and compare with its index
    //time complexity: O(n)

    //Using binary search:
    //The difference between an entry and its index

    public int searchForEntryEqualToItsIndex(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = (last - first) / 2 + first;
            int diff = nums[mid] - mid;
            //A[j] == j only diff == 0;
            if (diff == 0) {
                return mid;
            } else if (diff > 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    //variant: nums may contain duplicate

    public int searchForEntryEqualsToItsIndexWithDuplicateElements(int[][] nums) {
        return -1;
    }
}
