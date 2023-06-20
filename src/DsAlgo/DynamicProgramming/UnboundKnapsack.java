package DsAlgo.DynamicProgramming;

public class UnboundKnapsack {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        int[][] dp = new int[profit.length][w+1];
        for(int i = weight[0]; i<=w; i++){
            dp[0][i] = (int)(i/weight[0])*profit[0];
        }

        for (int i =1; i<dp.length; i++){
            for (int j = 0; j<=w; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if (weight[i]<=j){
                    take = profit[i] + dp[i][j-weight[i]];
                }

                dp[i][j] = Math.max(take, notTake);
            }
        }

        return dp[dp.length-1][w];

    }
    public static void main(String[] args) {

    }
}
