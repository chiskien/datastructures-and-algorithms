package chiskien.datastructures_algorithms.datacompression;

public class RunLengthEncoding {


    //RLE compression offers a fast way to do efficient on-the-fly compression
    //Idea:
    // - Encode successive repeated characters by the repetition of the character
    // Example: aaabbcc -> 3a2b2c

    public String decoding(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0'; //get the digit at index i
                count = count * 10 + digit; //compute until meet non-digit character
            } else { //if c is a letter
//                result.append(String.valueOf(c).repeat(Math.max(0, count)));
                while (count > 0) {
                    result.append(c);
                    count--;
                }
            }
        }
        return result.toString();
    }

    public String encoding(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char next = s.charAt(i + 1);
            if (c == next) {
                count++;
            } else {
                String value = String.valueOf(count);
                result.append(value).append(c);
            }
        }
        return result.toString();
    }
}
