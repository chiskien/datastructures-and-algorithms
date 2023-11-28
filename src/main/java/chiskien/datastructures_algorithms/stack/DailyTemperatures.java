package chiskien.datastructures_algorithms.stack;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {

    //Given an array of integers' temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temps = new int[]{77, 33, 33, 22, 80, 23};
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(temps)));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Temperature> stack = new LinkedList<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek().temperature) {
                Temperature t = stack.pop();
                result[t.index] = (i - t.index);
            }
            stack.push(new Temperature(i, temperatures[i]));
        }
        return result;
    }
}

class Temperature {
    public int index;
    public int temperature;

    public Temperature(int index, int temperature) {
        this.index = index;
        this.temperature = temperature;
    }
}
