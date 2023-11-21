package chiskien.datastructures_algorithms.searching.practices;

public class SearchFirstOccurenceOfK {

    //Write a program that takes a sorted array as input and a key.
    //Return the index of the first occurrence of that key
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 3, 4, 5, 6};
        SearchFirstOccurenceOfK searchFirstOccurenceOfK = new SearchFirstOccurenceOfK();
        System.out.println(searchFirstOccurenceOfK.findFirstOccurrenceGreaterThanK(nums, 5));
    }

    public int searchFirstOccurence(int[] nums, int k) {
        int first = 0;
        int last = nums.length - 1;
        int mid;
        while (first <= last) {
            mid = (last - first) / 2 + first;
            if (nums[mid] == k) {
                if (nums[mid - 1] == k) {
                    last = mid - 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] > k) {
                last = mid - 1;
            } else if (nums[mid] < k) {
                first = mid + 1;
            }
        }
        return -1;
    }

    //Variant:
    // Design an algorithm that takes a sorted array and a key, and finds the index of the first occurrence of an element greater than that key
    public int findFirstOccurrenceGreaterThanK(int[] nums, int k) {
        int first = 0;
        int last = nums.length - 1;
        int mid;
        while (first <= last) {
            mid = (last - first) / 2 + first;
            if (nums[mid] <= k) {
                first = mid + 1;
            } else if (nums[mid] > k) {
                if (nums[mid - 1] > k) {
                    last = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    //Variant
    //Let nums be an unsorted array of n integers, with nums[0] >= nums[1], and
    //nums[n - 2] <= nums[n - 1].
    // Call an index i be a local minimum if nums[i] is less than or equal to its neighbors. How would you efficiently find a local minimum if one exists?
}
