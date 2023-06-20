package DsAlgo.DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args) {

        int a[] = { 1, 5, 3, 7, 4 };
        int sum = 80;
        int[][] dp = new int[a.length][sum+1];
        for (int i =0; i<dp.length; i++){
            for (int j =0; j<=sum; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println("sum is "+sum);
        System.out.println("Using top down approach : " + isSubsetSum(a, sum, a.length-1, dp));
        System.out.printf("Using bottom up approach : " + isSubsetSum(a, sum));

    }


    //memoization : top down
    public static boolean isSubsetSum(int[] arr, int target,int index, int[][]dp){
        if (index == 0){
            if (target == arr[0]){
                return true;
            }else{
                return false;
            }
        }

        if (dp[index][target]!= -1){
            return dp[index][target] == 1;
        }

        boolean notTake = isSubsetSum(arr, target, index-1, dp);
        boolean take = false;
        if (arr[index]<=target){
            take = isSubsetSum(arr, target-arr[index], index-1, dp);
        }

        dp[index][target] = take||notTake ?1:0;

        return take||notTake;
    }


    //tabulation : bottom up
    static boolean isSubsetSum (int[]arr , int target){
        boolean[][] dp = new boolean[arr.length][target+1];
        for (int i =0; i<dp.length; i++){
            dp[i][0] = true;
        }

        if (arr[0]<=target){
            dp[0][arr[0]] = true;
        }

        for (int i = 1; i<dp.length ; i++){
            for (int j =1; j<=target; j++){
                boolean notTaken = dp[i-1][j];
                boolean take = false;
                if (arr[i]<= j){
                    take = dp[i-1][j-arr[i]];
                }

                dp[i][j] = take||notTaken;
            }
        }

        return dp[arr.length-1][target];
    }

}
