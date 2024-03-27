package chiskien.datastructures_algorithms.string;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "12345";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int i = num.length() - 1;
        if (num.charAt(i) % 2 == 1) return num;
        while (i >= 0) {
            if (num.charAt(i) % 2 == 1) return num.substring(0, i + 1);
            i--;
        }
        return "";
    }
}
