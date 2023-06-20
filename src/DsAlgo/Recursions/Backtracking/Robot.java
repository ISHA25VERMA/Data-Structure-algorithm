package DsAlgo.Recursions.Backtracking;

public class Robot {

    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0,0,0,2,0,0,0},{0,0,0,0,0,0,0,0,1,0}};
        System.out.println(memoization(grid));
    }

    //memoization
    private static int memoization(int[][] grid){

        int valids = 0;
        int sr = 0;
        int sc = 0;
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 0){
                    valids ++;
                }
                else if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
            }
        }

        int[][] visited = new int[grid.length][grid[0].length];
        return dfs(grid, sr,sc,visited, valids);
    }

    private static int dfs(int[][] grid, int row, int col, int[][] visited, int valids){
        if(row>= grid.length || row<0 || col >= grid[0].length || col<0){
            return 0;
        }

        if(grid[row][col] == -1 || visited[row][col] == 1 ){
            return 0;
        }

        if(grid[row][col] ==2){
            if(valids == -1){
                return 1;
            }else{
                return 0;
            }
        }

        visited[row][col] = 1;
        valids --;

        int ans = 0;
        ans += dfs(grid, row+1, col, visited, valids);
        ans += dfs(grid, row, col+1, visited, valids);
        ans += dfs(grid, row-1, col, visited, valids);
        ans += dfs(grid, row, col-1, visited, valids);

        valids++;
        visited[row][col] = 0;

        return ans;

    }



}
