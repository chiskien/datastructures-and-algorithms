package org.chiskien.datastructures_algorithms.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class ValidIPAddress {

    public List<String> getValidIPAddress(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 4 && i < s.length(); i++) {
            String first = s.substring(0, i);
            if (isValidPart(first)) {
                for (int j = 1; i + j < s.length() && j < 4; j++) {
                    String second = s.substring(i, i + j);
                    if (isValidPart(second)) {
                        for (int k = 1; k + i + j < s.length() && k < 4; k++) {
                            String third = s.substring(i + j, i + j + k);
                            String fourth = s.substring(i + j + k);
                            if (isValidPart(third) && isValidPart(fourth)) {
                                result.add(first + "." + second + "." + third + "."
                                        + fourth);
                            }
                        }
                    }

                }
            }
        }
        return result;
    }

    private boolean isValidPart(String s) {
        if (s.length() > 3) {
            return false;
        }
        if (s.startsWith("0") && s.length() > 1) {
            return false;
        }
        int val = Integer.parseInt(s);
        return val <= 255 && val >= 0;

    }
}
