package org.chiskien.datastructures.hackerrank;

import java.util.List;

public class Main {


    public static void getStairCase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void plusMinus(List<Integer> arr) {
        int countNegativeValue = 0;
        int countPositiveValue = 0;
        int countZeroValue = 0;
        double negativeRatios;
        double positiveRatios;
        double zeroRatios;

        for (Integer integer : arr) {
            if (integer.compareTo(0) < 0) {
                countNegativeValue++;
            } else if (integer.compareTo(0) == 0) {
                countZeroValue++;
            } else {
                countPositiveValue++;
            }
        }

        negativeRatios = countNegativeValue * 1.0 / arr.size();
        positiveRatios = countPositiveValue * 1.0 / arr.size();
        zeroRatios = countZeroValue * 1.0 / arr.size();
        System.out.println(negativeRatios);
        System.out.println(positiveRatios);
        System.out.println(zeroRatios);
    }

    public static int hourClassSum(List<List<Integer>> arr) {
//        List<Integer> row = List.of(1, 2, 3, 5, 6, 8);
//        List<Integer> row2 = List.of(4, 5, 6);
//        List<Integer> row3 = List.of(9, 8, 9);
//        List<List<Integer>> arr = List.of(row, row2, row3);
//        System.out.println(hourClassSum(arr));
        int sumFirstCross = 0;
        int sumSecondCross = 0;
        int i = 0;
        for (List<Integer> list : arr) {
            sumFirstCross += list.get(i++);
            sumSecondCross += list.get(list.size() - i);
        }
        return Math.abs(sumFirstCross - sumSecondCross);
    }

    public static void miniMaxSum(List<Integer> arr) {
        int minItem = arr.get(0);
        int maxItem = arr.get(arr.size() - 1);
        for (Integer integer : arr) {
            if (integer <= minItem) {
                minItem = integer;
            }
            if (integer >= maxItem) {
                maxItem = integer;
            }
        }
        long minSum = 0;
        long maxSum = 0;
        for (Integer integer : arr) {
            if (integer == maxItem && integer == minItem) {
                minSum = maxSum = integer * 4;
            }
            if (integer <= maxItem && integer > minItem) {
                maxSum += integer;
            }
            if (integer >= minItem && integer < maxItem) {
                minSum += integer;
            }
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int maxValue = candles.get(candles.size() - 1);
        for (Integer integer : candles) {
            if (integer >= maxValue) {
                maxValue = integer;
            }
        }
        for (Integer integer : candles) {
            if (integer == maxValue) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void fizzBuzz(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.append("FizzBuzz ");
            } else if (i % 3 == 0) {
                output.append("Fizz ");
            } else if (i % 5 == 0) {
                output.append("Buzz ");
            } else {
                output.append(i).append(" ");
            }
        }
        System.out.println(output);
    }
}
