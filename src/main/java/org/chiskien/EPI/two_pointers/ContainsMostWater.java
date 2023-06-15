package org.chiskien.EPI.two_pointers;

public class ContainsMostWater {
    public static void main(String[] args) {
        int[] h = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(h));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            int width = j - i;
            int minHeight = Math.min(height[i], height[j]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
