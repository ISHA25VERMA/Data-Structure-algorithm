package DsAlgo.Graphs.Questions;
class SolutionIsland {
    public int numIslands(char[][] grid) {
        char[][] visited = new char[grid.length][grid[0].length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                visited[i][j] = '0';
            }
        }
        int islands = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == '1' && visited[i][j] == '0'){
                    islands++;
                    traverse(i, j, visited, grid);
                }
            }
        }

        return islands;
    }

    private void traverse(int i, int j, char[][] visited, char[][] grid){
        visited[i][j] = '1';
        if(i> 0 && grid[i-1][j] == '1' && visited[i-1][j] == '0'){
            traverse(i-1, j, visited, grid);
        }
        // if(i>0 && j>0 && grid[i-1][j-1] == '1' && visited[i-1][j-1] == '0'){
        //     traverse(i-1, j-1, visited, grid);
        // }
        if(j> 0 && grid[i][j-1] == '1' && visited[i][j-1] == '0'){
            traverse(i, j-1, visited, grid);
        }
        // if(i>0 && j<grid[0].length-1 &&grid[i-1][j+1] == '1' && visited[i-1][j+1] == '0' ){
        //     traverse(i-1, j+1, visited, grid);
        // }
        // if(i<grid.length-1 && j>0 && grid[i+1][j-1] == '1' && visited[i+1][j-1] == '0' ){
        //     traverse(i+1, j-1, visited, grid);
        // }
        if(i<grid.length-1 && grid[i+1][j] == '1' && visited[i+1][j] == '0' ){
            traverse(i+1, j, visited, grid);
        }
        if(j<grid[0].length-1 && grid[i][j+1] == '1' && visited[i][j+1] == '0' ){
            traverse(i, j+1, visited, grid);
        }
        // if(i<grid.length-1 && j<grid[0].length-1 && grid[i+1][j+1] == '1' && visited[i+1][j+1] == '0'  ){
        //     traverse(i+1, j+1, visited, grid);
        // }

    }
}
public class NumberOfIslands {
}
