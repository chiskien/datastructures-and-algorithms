package chiskien.datastructures_algorithms.neetcode150;

public class ContainsMostWater {


    //Given int[] heights: heights[i] = ith's veritcal heights.
    //return a maximum value amount of water a container can store


    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxArea = 1;
        while (i < j) {
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            maxArea = Math.max(maxArea, width * height);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
