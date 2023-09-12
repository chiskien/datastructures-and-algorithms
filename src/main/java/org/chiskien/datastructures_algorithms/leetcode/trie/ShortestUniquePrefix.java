package org.chiskien.datastructures_algorithms.leetcode.trie;

import java.util.Set;

public class ShortestUniquePrefix {

    //Problem: Find the shortest prefix of a string that is not in a set of strings (dictionary)
    public String findShortestPrefix(String word, Set<String> dictionary) {
        Trie trie = new Trie();
        for (String s : dictionary) {
            trie.insert(s);
        }
        return trie.getShortestUniquePrefix(word);
    }
}
