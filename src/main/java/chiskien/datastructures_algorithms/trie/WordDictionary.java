package chiskien.datastructures_algorithms.trie;


//Design a data structure that supports adding new words and finding if a string matches any previously added string.

//Word Dictionary class:
public class WordDictionary {

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("cock");
        System.out.println(wordDictionary.searchWord("..ck"));
    }

    Trie trie;

    //Constructor: Initializes the object
    public WordDictionary() {
        trie = new Trie();
    }

    //add word to data structure, it can be matched latter
    public void addWord(String word) {
        trie.insert(word);
    }

    //bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
    public boolean searchWord(String word) {
        TrieNode trieNode = trie.root;
        for (Character c : word.toCharArray()) {
            while (c == '.') {
                c++;
            }
            if (!trieNode.getChildren().containsKey(c)) {
                return false;
            }
            trieNode = trieNode.getChildren().get(c);
        }
        return trieNode.isWord;
    }
}
