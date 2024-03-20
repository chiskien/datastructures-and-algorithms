package chiskien.effectivejava.chapter1_objectslifecycle.item6;

import java.util.regex.Pattern;

class ObjectMatcher {
    private static final Pattern ROMAN = Pattern.compile("");

    public boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    }
}
