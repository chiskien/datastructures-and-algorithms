package org.chiskien.datastructures_algorithms.leetcode.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MnemonicsForAPhoneNumber {
    public static void main(String[] args) {
        MnemonicsForAPhoneNumber mn = new MnemonicsForAPhoneNumber();
        System.out.println(mn.phoneMnemonics("23"));
    }

    private final static String[] MAPPING
            = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    public List<String> phoneMnemonics(String phoneNumber) {
        char[] partialMnemonics = new char[phoneNumber.length()];
        List<String> mnemonics = new ArrayList<>();
        phoneMnemonicHelper(phoneNumber, 0, partialMnemonics, mnemonics);
        return mnemonics;
    }

    private void phoneMnemonicHelper(String phoneNumber, int digit,
                                     char[] partialMnemonics,
                                     List<String> mnemonics) {
        if (digit == phoneNumber.length()) {
            // All digits are processed, so add partialMnemonic to mnemonics
            mnemonics.add(new String(partialMnemonics));
        } else {
            //try all possible characters for this digit
            int possibleCharactersIndex = phoneNumber.charAt(digit) - '0';
            String possibleCharacters = MAPPING[possibleCharactersIndex];
            for (int i = 0; i < possibleCharacters.length(); i++) {
                char c = MAPPING[possibleCharactersIndex].charAt(i);
                partialMnemonics[digit] = c;
                phoneMnemonicHelper(phoneNumber, digit + 1, partialMnemonics, mnemonics);
            }
        }
    }
}
