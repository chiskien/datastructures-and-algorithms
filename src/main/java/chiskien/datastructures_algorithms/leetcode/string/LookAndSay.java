package chiskien.datastructures_algorithms.leetcode.string;

public class LookAndSay {
    public String lookAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n; i++) {
            s = nextNumbers(s);
        }
        return s;
    }

    public String nextNumbers(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                ++i;
                ++count;
            }
            builder.append(count);
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
