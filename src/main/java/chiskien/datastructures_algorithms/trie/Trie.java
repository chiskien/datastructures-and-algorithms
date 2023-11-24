package chiskien.datastructures_algorithms.trie;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentTrieNode = root;
        for (Character c : word.toCharArray()) {
            if (!currentTrieNode.children.containsKey(c)) {
                currentTrieNode.children.put(c, new TrieNode());
            }
            currentTrieNode = currentTrieNode.children.get(c);
        }
        currentTrieNode.isWord = true;
    }

    public boolean search(String word) {
        TrieNode currentTrieNode = root;
        for (Character c : word.toCharArray()) {
            if (!currentTrieNode.children.containsKey(c)) {
                return false;
            }
            currentTrieNode = currentTrieNode.children.get(c);
        }
        return currentTrieNode.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentTrieNode = root;
        for (Character c : prefix.toCharArray()) {
            if (!currentTrieNode.children.containsKey(c)) {
                return false;
            }
            currentTrieNode = currentTrieNode.children.get(c);
        }
        return true;
    }

    public String getShortestUniquePrefix(String word) {
        TrieNode currentTrieNode = root;
        StringBuilder prefix = new StringBuilder();
        for (Character c : word.toCharArray()) {
            prefix.append(c);
            if (!currentTrieNode.children.containsKey(c)) {
                return prefix.toString();
            }
            currentTrieNode = currentTrieNode.children.get(c);
        }
        return "";
    }
}
