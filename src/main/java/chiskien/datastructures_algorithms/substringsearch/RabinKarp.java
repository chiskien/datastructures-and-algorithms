package chiskien.datastructures_algorithms.substringsearch;

public class RabinKarp {
    public static void main(String[] args) {
        RabinKarp rabinKarp = new RabinKarp();
        System.out.println(rabinKarp.substringSearch("mot con", "mot vit con vit mot con"));
    }

    //Related: Sliding windows, Strings, Hashing
    // Time complexity: O(n + m) with n is the length of t, m is the length of s.
    public int substringSearch(String s, String t) {

        if (s.length() > t.length()) return -1;

        final int BASE = 26;
        int tHash = 0;
        int sHash = 0;
        int powerS = 1; //BASE ^ |s|

        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                powerS = powerS * BASE;
            }
            tHash = tHash * BASE + t.charAt(i);
            sHash = sHash * BASE + s.charAt(i);

        }
        for (int i = s.length(); i < t.length(); i++) {
            //Checks the two substrings are actually equal or not, to protect against hash collision
            if (tHash == sHash && t.startsWith(s, i - s.length())) {
                return i - s.length();
            }
            //Use rolling hash to compute a new hash code.
            tHash -= t.charAt(i - s.length()) * powerS;
            tHash = tHash * BASE + t.charAt(i);
        }
        if (tHash == sHash && t.endsWith(s)) {
            return t.length() - s.length();
        }
        return -1;
    }
}
