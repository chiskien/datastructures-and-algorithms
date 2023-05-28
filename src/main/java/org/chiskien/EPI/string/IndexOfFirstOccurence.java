package org.chiskien.EPI.string;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        System.out.println(strStr("AmigoAmi", "Ami"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
