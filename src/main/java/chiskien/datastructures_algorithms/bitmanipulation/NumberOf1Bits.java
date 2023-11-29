package chiskien.datastructures_algorithms.bitmanipulation;

public class NumberOf1Bits {

    //Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

    public int hammingWeight(int n) {
        int count = 0;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
