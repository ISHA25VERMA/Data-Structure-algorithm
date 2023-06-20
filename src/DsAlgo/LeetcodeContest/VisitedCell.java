package DsAlgo.LeetcodeContest;

public class VisitedCell {
    public static void main(String[] args) {
        int[][] grid = {{2,1,0},{1,0,0}};
        System.out.println(minimumVisitedCells(grid));
    }
    public static int minimumVisitedCells(int[][] grid) {
        return path(0, 0, grid, new int[grid.length][grid[0].length]);
    }

    private static int path(int row, int col, int[][] grid, int[][] visited){
        if(row>= grid.length || col >= grid[0].length){
            return 0;
        }

        if(row == grid.length-1 && col == grid[0].length-1){
            return 1;
        }

        if(visited[row][col] != 0){
            return visited[row][col];
        }

        int ans = (int)1e9;

        for(int i = col+1; i<=grid[row][col]+col; i++){
            int n = path(row, i, grid, visited) ;
            if((n != (int)1e9) && (n!= 0)){
                ans =  Math.min(ans, 1+n );
            }
        }

        for(int i = row+1; i<=grid[row][col]+row; i++){
            int n = path(i, col, grid, visited);
            if((n != (int)1e9)  && (n!= 0)){
                ans =  Math.min(ans, 1+n );
            }
        }

        visited[row][col] = ans;
        return ans;
    }
}
