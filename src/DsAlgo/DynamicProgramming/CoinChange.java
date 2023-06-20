package DsAlgo.DynamicProgramming;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];


        //memoization
        // for (int i =0; i<dp.length; i++){
        //     for (int j = 0; j<dp[0].length; j++){
        //         dp[i][j] = -1;
        //     }
        // }

        //tabulation
        for(int i =0; i<=amount; i++){
            if (i%coins[0] == 0){
                dp[0][i] = i/coins[0];
            }else{
                dp[0][i] = (int)Math.pow(10,9);
            }
        }

        for (int i = 1; i<dp.length; i++){
            for (int j = 1; j<=amount; j++){
                int notTake = dp[i-1][j];
                int take = (int)Math.pow(10,9);
                if(coins[i]<= j){
                    take = 1+dp[i][j-coins[i]];
                }

                dp[i][j] = Math.min(take, notTake);
            }
        }

        int ans =  dp[dp.length-1][amount];

        //memoization
        // int ans =  minCoins(coins.length-1, amount, coins, dp);

        if (ans == (int)Math.pow(10,9)){
            return -1;
        }else{
            return ans;
        }
    }


    //memoization
//     private int minCoins(int index, int amount, int[] coins, int[][] dp){
//         if (amount == 0){
//             return 0;
//         }
//         if (index == 0){
//             if(amount%coins[0] == 0){
//                 return amount/coins[0];
//             }else{
//                 return (int)Math.pow(10,9);
//             }
//         }
//         if (dp[index][amount]!= -1) return dp[index][amount];
//         int notTake = minCoins(index-1, amount, coins, dp);
//         int take = (int)Math.pow(10,9);

//         if (coins[index]<=amount){
//             take = 1+minCoins(index, amount-coins[index], coins, dp);
//         }

//         dp[index][amount] = Math.min(take, notTake);

    //         return Math.min(take, notTake);
//     }
    public static void main(String[] args) {

    }
}
