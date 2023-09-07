package org.chiskien.leetcode.trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    public boolean isWord;

    public Map<Character, TrieNode> childrens; //pointers

    public TrieNode() {
        this.isWord = false;
        this.childrens = new HashMap<>();
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Map<Character, TrieNode> getChildrens() {
        return childrens;
    }

    public void setChildrens(Map<Character, TrieNode> childrens) {
        this.childrens = childrens;
    }
}
