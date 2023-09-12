package org.chiskien.datastructures_algorithms.codility;

public class BinaryGap {

    public void maxGap() {
        int N = 5;
        int maxGap = 0;
        String binary = Integer.toBinaryString(N);
        String[] subBinary = binary.split("1");
        for (String bin : subBinary) {
            if (!bin.equals("")) {
                char[] zeroSequences = bin.toCharArray();
                int gap = zeroSequences.length;
                if (gap > maxGap) {
                    maxGap = gap;
                }
            }
        }
        System.out.println(maxGap);
    }

}
