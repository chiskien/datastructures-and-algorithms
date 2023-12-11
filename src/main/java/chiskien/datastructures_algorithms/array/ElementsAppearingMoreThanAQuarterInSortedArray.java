package chiskien.datastructures_algorithms.array;

public class ElementsAppearingMoreThanAQuarterInSortedArray {
    //Given an integer array sorted in non-decreasing order,
    //there is exactly one integer in the array that occurs more than 25% of the time,
    // return that integer.
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,5,5,5,6,6,6,7,7,7,8,8,8,9};
        System.out.println(findSpecialInteger(nums));
    }
    public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int quarter = n / 4; //25%
        int count = 1;
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            } else {
                count = 1;
            }
            if (count > quarter) {
                return arr[i];
            }
            num = arr[i];
        }
        return num;
    }
}
