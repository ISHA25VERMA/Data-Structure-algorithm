package DsAlgo.Trie;

public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode temp = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!temp.containsKey(ch)){
                TrieNode child = new TrieNode();
                child.putData(ch);
                temp.children[ch-'a'] = child;
            }

            temp = temp.children[ch-'a'];
        }

        temp.isTerminal = true;
    }

    public boolean search(String word){
        TrieNode temp = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(temp.containsKey(ch)){
                temp = temp.children[ch-'a'];
            }else{
                return false;
            }
        }

        if(temp.isTerminal){
            return true;
        }else {
            return false;
        }
    }

    public boolean startsWith(String word){
        TrieNode temp = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(temp.containsKey(ch)){
                temp = temp.children[ch-'a'];
            }else{
                return false;
            }
        }

        return true;
    }


}
