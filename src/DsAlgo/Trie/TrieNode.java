package DsAlgo.Trie;

public class TrieNode {
    char data;
    TrieNode[] children;
    boolean isTerminal;

    TrieNode(){
        children = new TrieNode[26];
        isTerminal = false;
    }

    public boolean containsKey(char ch){
        return children[ch-'a']!= null;
    }

    public void putData(char data){
        this.data = data;
    }


}
