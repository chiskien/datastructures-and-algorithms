package chiskien.datastructures_algorithms.leetcode150;


/**
 * LeetCode 27: Remove Element
 * <br>
 *
 * @author chisk
 * @since 21
 */
public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2, 32, 32, 15, 511, 11}, 32));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }

        }
        return k;
    }
}
