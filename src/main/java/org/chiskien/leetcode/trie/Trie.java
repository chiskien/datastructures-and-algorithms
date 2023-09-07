package org.chiskien.leetcode.trie;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            if (!current.childrens.containsKey(c)) {
                current.childrens.put(c, new TrieNode());
            }
            current = current.childrens.get(c);
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            if (!current.childrens.containsKey(c)) {
                return false;
            }
            current = current.childrens.get(c);
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (Character c : prefix.toCharArray()) {
            if (!current.childrens.containsKey(c)) {
                return false;
            }
            current = current.childrens.get(c);
        }
        return true;
    }

    public String getShortestUniquePrefix(String word) {
        TrieNode current = root;
        StringBuilder prefix = new StringBuilder();
        for (Character c : word.toCharArray()) {
            prefix.append(c);
            if (!current.childrens.containsKey(c)) {
                return prefix.toString();
            }
            current = current.childrens.get(c);
        }
        return "";
    }
}
