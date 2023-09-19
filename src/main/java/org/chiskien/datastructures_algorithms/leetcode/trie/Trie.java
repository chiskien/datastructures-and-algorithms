package org.chiskien.datastructures_algorithms.leetcode.trie;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentTrieNode = root;
        for (Character c : word.toCharArray()) {
            if (!currentTrieNode.childrens.containsKey(c)) {
                currentTrieNode.childrens.put(c, new TrieNode());
            }
            currentTrieNode = currentTrieNode.childrens.get(c);
        }
        currentTrieNode.isWord = true;
    }

    public boolean search(String word) {
        TrieNode currentTrieNode = root;
        for (Character c : word.toCharArray()) {
            if (!currentTrieNode.childrens.containsKey(c)) {
                return false;
            }
            currentTrieNode = currentTrieNode.childrens.get(c);
        }
        return currentTrieNode.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentTrieNode = root;
        for (Character c : prefix.toCharArray()) {
            if (!currentTrieNode.childrens.containsKey(c)) {
                return false;
            }
            currentTrieNode = currentTrieNode.childrens.get(c);
        }
        return true;
    }

    public String getShortestUniquePrefix(String word) {
        TrieNode currentTrieNode = root;
        StringBuilder prefix = new StringBuilder();
        for (Character c : word.toCharArray()) {
            prefix.append(c);
            if (!currentTrieNode.childrens.containsKey(c)) {
                return prefix.toString();
            }
            currentTrieNode = currentTrieNode.childrens.get(c);
        }
        return "";
    }
}
