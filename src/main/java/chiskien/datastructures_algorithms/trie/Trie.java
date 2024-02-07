package chiskien.datastructures_algorithms.trie;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentTrieNode = root;
        for (Character c : word.toCharArray()) {
            if (!currentTrieNode.getChildren().containsKey(c)) {
                currentTrieNode.getChildren().put(c, new TrieNode());
            }
            currentTrieNode = currentTrieNode.getChildren().get(c);
        }
        currentTrieNode.isWord = true;
    }

    public boolean search(String word) {
        TrieNode currentTrieNode = root;
        for (Character c : word.toCharArray()) {
            if (!currentTrieNode.getChildren().containsKey(c)) {
                return false;
            }
            currentTrieNode = currentTrieNode.getChildren().get(c);
        }
        return currentTrieNode.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentTrieNode = root;
        for (Character c : prefix.toCharArray()) {
            if (!currentTrieNode.getChildren().containsKey(c)) {
                return false;
            }
            currentTrieNode = currentTrieNode.getChildren().get(c);
        }
        return true;
    }

    public String getShortestUniquePrefix(String word) {
        TrieNode currentTrieNode = root;
        StringBuilder prefix = new StringBuilder();
        for (Character c : word.toCharArray()) {
            prefix.append(c);
            if (!currentTrieNode.getChildren().containsKey(c)) {
                return prefix.toString();
            }
            currentTrieNode = currentTrieNode.getChildren().get(c);
        }
        return "";
    }
}
