package DsAlgo.DynamicProgramming;

class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];

        for (int i = 0; i<n ; i++){
            for (int j = 0; j<m; j++){
                for (int k =0; k<m; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        return Math.max(0,maxCherries(0,0,0, grid, dp, n, m));
    }

    private int maxCherries(int i, int j1, int j2, int[][] grid, int[][][]dp , int n , int m){
        int i2 = i+j1-j2;
        if(i==n || i2==n || j1==m|| j2==m ){
            return (int)1e-9;
        }
        if ((grid[i][j1] == -1 )|| (grid[i2][j2] == -1) ){
            return (int)1e-9;
        }
        else if(i == n-1 && j1 == m-1){
            return grid[i][j1];
        }
        else if(dp[i][j1][j2] != -1){
            return dp[i][j1][j2];
        }

        int ans = grid[i][j1];
        if (j1!= j2){
            ans += grid[i2][j2];
        }
        ans += Math.max(Math.max(maxCherries(i, j1+1, j2+1, grid, dp, n, m),maxCherries(i+1, j1, j2+1, grid, dp, n, m) ),
                Math.max(maxCherries(i, j1+1, j2, grid, dp, n, m), maxCherries(i+1, j1, j2, grid, dp, n, m)));

        dp[i][j1][j2] = ans;
        return ans;
    }
}

public class CherryPickup {
    public static int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];

        for (int i = 0; i<n ; i++){
            for (int j = 0; j<m; j++){
                for (int k =0; k<m; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        return Math.max(0,maxCherries(0,0,0, grid, dp, n, m));
    }

    private static int maxCherries(int i, int j1, int j2, int[][] grid, int[][][]dp , int n , int m){
        int i2 = i+j1-j2;
        if(i==n || i2==n || j1==m|| j2==m ){
            return (int)-1e9;
        }
        if ((grid[i][j1] == -1 )|| (grid[i2][j2] == -1) ){
            return (int)-1e9;
        }
        else if(i == n-1 && j1 == m-1){
            return grid[i][j1];
        }
        else if(dp[i][j1][j2] != -1){
            return dp[i][j1][j2];
        }

        int ans = grid[i][j1];
        if (j1!= j2){
            ans += grid[i2][j2];
        }
        ans += Math.max(Math.max(maxCherries(i, j1+1, j2+1, grid, dp, n, m),maxCherries(i+1, j1, j2+1, grid, dp, n, m) ),
                Math.max(maxCherries(i, j1+1, j2, grid, dp, n, m), maxCherries(i+1, j1, j2, grid, dp, n, m)));

        dp[i][j1][j2] = ans;
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,-1},{1,-1,1},{-1,1,1}};
        System.out.println(cherryPickup(grid));
    }
}
