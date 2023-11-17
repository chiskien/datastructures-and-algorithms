package chiskien.datastructures_algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class MnemonicsForAPhoneNumber {

    private final static String[] MAPPING
            = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    public List<String> letterCombinations(String digits) {
        char[] partialMnemonics = new char[digits.length()];
        List<String> mnemonics = new ArrayList<>();
        if (digits.isEmpty()) return mnemonics;
        phoneMnemonicHelper(digits, 0, partialMnemonics, mnemonics);
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
                phoneMnemonicHelper(phoneNumber, digit + 1, partialMnemonics,
                        mnemonics);
            }
        }
    }
}
