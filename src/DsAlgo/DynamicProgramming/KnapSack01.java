package DsAlgo.DynamicProgramming;

import java.util.Arrays;

public class KnapSack01 {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[weight.length][maxWeight+1];
        //memoization
        for (int i = 0; i<dp.length; i++){
            for (int j = 0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return knapsackSolve(weight.length-1, maxWeight, value, weight, dp);
    }


    //memoization
    private static int knapsackSolve(int index, int weightleft, int[] value, int[] weight, int[][] dp){
        if (weightleft == 0){
            return 0;
        }
        if (index == 0){
            if (weight[0]<=weightleft){
                return value[0];
            }else{
                return 0;
            }
        }

        if (dp[index][weightleft]!= -1){
            return dp[index][weightleft];
        }

        int notTake = knapsackSolve(index-1, weightleft, value, weight, dp);
        int take = 0;
        if (weight[index]<=weightleft){
            take = value[index] + knapsackSolve(index-1, weightleft-weight[index], value, weight, dp);
        }

        dp[index][weightleft] = Math.max(take, notTake);

        return Math.max(take, notTake);

    }
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;
        System.out.println("Weight of objects : "+Arrays.toString(wt));
        System.out.println("Value of objects : "+Arrays.toString(val));
        System.out.println("Maximum weight : "+W);
        System.out.println("Maximum profit : "+knapsack(wt, val,val.length, W));
    }
}
