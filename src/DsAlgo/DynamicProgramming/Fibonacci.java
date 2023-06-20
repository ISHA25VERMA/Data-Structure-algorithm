package DsAlgo.DynamicProgramming;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int[] dp  = new int[n+1];
        for (int i=0; i<n+1; i++) dp[i] = -1;
        System.out.println(fibonacci(n, dp));
    }

    public static int fibonacci(int n, int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!= -1) return dp[n];

        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);

        return dp[n];
    }
}
