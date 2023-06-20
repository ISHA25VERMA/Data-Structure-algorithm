package DsAlgo.DynamicProgramming;

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] points = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}
        };
        System.out.println(ninjaTraining(3, points));
    }

    public static int ninjaTraining(int n, int points[][]) {
        int[][] dp = new int[points.length][4];

        for (int i =0; i<dp.length; i++){
            for (int j =0; j<4; j++){
                dp[i][j] = -1;
            }
        }

        return training(n-1, 3, points, dp);

    }

    private static int training(int day,int prevActivity, int[][]points, int[][] dp){
        if (day ==0){
            if (prevActivity == 0){
                return Math.max(points[0][1], points[0][2]);
            }
            if (prevActivity == 1){
                return Math.max(points[0][0], points[0][2]);
            }
            if(prevActivity == 2){
                return Math.max(points[0][0], points[0][1]);
            }
            else{
                return Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
            }
        }

        if (dp[day][prevActivity] != -1){
            return dp[day][prevActivity];
        }
        int maxi =0;
        for (int i = 0; i<3; i++){
            if(i!= prevActivity){
                int activity = points[day][i] + training(day-1, i, points,dp );
                maxi = Math.max(maxi, activity);
            }
        }

        dp[day][prevActivity] = maxi;

        return dp[day][prevActivity];

    }
}
