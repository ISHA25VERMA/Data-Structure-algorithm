package DsAlgo.Trie.Questions;

import DsAlgo.Trie.Trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("and");
        list.add("sand");
        list.add("cat");
        list.add("an");

        System.out.println(wordBreak("catsandogcat", list));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();
        for(String word : wordDict){
            trie.insert(word);
        }

        int n = s.length()+1;
        int[][] dp = new int[n][n+1];
        for(int i = 0;i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return canBreak(s, trie, 0, dp, n);

    }

    private static boolean canBreak(String s, Trie trie, int i, int[][] dp, int n){
        if(s.substring(i).length() == 0){
            return true;
        }
        boolean ans = false;
        for (int j =i; j<=s.length(); j++){
            if(dp[i][j]!= -1){
                return dp[i][j] == 1;
            }
            if(trie.search(s.substring(i,j))){
                ans = canBreak(s, trie, j, dp, n);
                dp[i][j]= ans?1:0;
                if(ans){
                    return true;
                }
            }else{
                dp[i][j] = 0;
            }
        }

        return ans;
//        if(s.length() == 0){
//            return true;
//        }
//
//        int n = s.length();
//
//        for (int j =0; j<=s.length(); j++){
//
//            if(trie.search(s.substring(0,j))){
//                boolean ans = canBreak(s.substring(j, n), trie);
//                if(ans == false){
//                    continue;
//                }else{
//                    return true;
//                }
//            }
//        }
//
//        return false;
    }
}
