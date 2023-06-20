package DsAlgo.DynamicProgramming.substrings;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                dp[i][j] = -1;
            }
        }

        int ans = subsequence(n-1, m-1, text1, text2, dp);

        return ans;
    }

    static void lcsPrint(String s1, String s2) {

        int n=s1.length();
        int m=s2.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i] = 0;
        }

        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                else
                    dp[ind1][ind2] = Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
            }
        }

        int len=dp[n][m];
        int i=n;
        int j=m;

        int index = len-1;
        String str="";
        for(int k=1; k<=len;k++){
            str +="$"; // dummy string
        }
        StringBuilder ss= new StringBuilder(s1);
        StringBuilder str2=new StringBuilder(str);
        while(i>0 && j>0){
            if(ss.charAt(i-1) == s2.charAt(j-1)){
                str2.setCharAt(index,ss.charAt(i-1) );
                index--;
                i--;
                j--;
            }
            else if(ss.charAt(i-1)>s2.charAt(j-1)){
                i--;
            }
            else j--;
        }
        System.out.println(str2);
    }


    //memoization : 30ms
    private static int subsequence(int i1, int i2, String str1, String str2, int[][] dp){

        if (i1 < 0 || i2 <0){
            return 0;
        }

        if (dp[i1][i2]!= -1){
            return dp[i1][i2];
        }

        if (str1.charAt(i1) == str2.charAt(i2)){
            dp[i1][i2] = 1 + subsequence(i1-1, i2-1, str1, str2, dp);
            return dp[i1][i2];
        }else{
            dp[i1][i2] = Math.max(subsequence(i1-1, i2, str1, str2, dp), subsequence(i1, i2-1, str1, str2, dp));
            return dp[i1][i2];
        }

        //print subsequence




    }

    //normal recursion : TLE
    private int subsequence(int i1, int i2, String str1, String str2){
        if (i1 == -1 || i2 == -1){
            return 0;
        }

        if (str1.charAt(i1) == str2.charAt(i2)){
            return 1 + subsequence(i1-1, i2-1, str1, str2);
        }else{
            return Math.max(subsequence(i1-1, i2, str1, str2), subsequence(i1, i2-1, str1, str2));
        }


    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "bdgek"));
    }
}
