package chiskien.datastructures_algorithms.string;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        BackSpaceStringCompare backSpaceStringCompare = new BackSpaceStringCompare();
        backSpaceStringCompare.backspaceCompare("aa#",""    );

    }

    public boolean backspaceCompare(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '#' && i >= 1) {
                sBuilder.deleteCharAt(i-1);
                i++;
            } else {
                sBuilder.append(s.charAt(i++));
            }
        }
        return sBuilder.toString().contentEquals(tBuilder);
    }
}
