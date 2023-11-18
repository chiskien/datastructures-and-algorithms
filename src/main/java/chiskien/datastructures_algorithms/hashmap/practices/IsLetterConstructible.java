package chiskien.datastructures_algorithms.hashmap.practices;

import java.util.HashMap;
import java.util.Map;

public class IsLetterConstructible {

    //Write a program to determine that letter from String text can be construct from letter from String magazineText
    public boolean isLetterConstructible(String text, String magazineText) {

        //Create a hashmap to store a letter with their frequency appearances
        Map<Character, Integer> frequenciesMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (frequenciesMap.containsKey(c)) {
                frequenciesMap.put(c, frequenciesMap.get(c) + 1);
            } else {
                frequenciesMap.put(c, 1);
            }
        }
        for (Character c : magazineText.toCharArray()) {
            if (frequenciesMap.containsKey(c)) {
                frequenciesMap.put(c, frequenciesMap.get(c) - 1);
                if (frequenciesMap.get(c) == 0) {
                    frequenciesMap.remove(c);
                    if (frequenciesMap.isEmpty()) {
                        break;
                    }
                }
            }
        }
        return frequenciesMap.isEmpty();
    }
}
