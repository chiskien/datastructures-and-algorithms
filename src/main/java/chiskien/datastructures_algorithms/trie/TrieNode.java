package chiskien.datastructures_algorithms.trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    public boolean isWord;

    private Map<Character, TrieNode> children; //pointers

    public TrieNode() {
        this.isWord = false;
        this.children = new HashMap<>();
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }
}
