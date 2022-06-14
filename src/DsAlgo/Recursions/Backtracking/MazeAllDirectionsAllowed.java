package DsAlgo.Recursions.Backtracking;

import java.util.Arrays;
//backtracking
public class MazeAllDirectionsAllowed {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(countPaths(maze,0,0));
        boolean [][] maze2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        printPaths(maze2,"",0,0);

        boolean [][] maze3 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int [][] path = new int[maze3.length][maze3[0].length];

        printPathInMaze(maze3,0,0,path,1);
    }
    public static int countPaths(boolean [][]maze, int r, int c){
        int ans = 0;
        if (r == maze.length -1 && c == maze[1].length -1){
            ans += 1;
            maze[r][c] = true;
            return ans;
        }
        if (!maze[r][c]){
            return ans;
        }else {
            maze[r][c] = false;
        }

        if (r < maze.length-1){
            ans += countPaths(maze,r+1,c);
        }
        if (c<maze[0].length-1){
            ans += countPaths(maze,r,c+1);
        }

        if (r>0){
            ans += countPaths(maze,r-1,c);
        }
        if (c>0){
            ans+= countPaths(maze, r,c-1);
        }

        maze[r][c] = true;
        return ans;
    }

    public static void printPaths(boolean [][]maze, String path, int r, int c){
        if (r == maze.length -1 && c == maze[1].length -1){
            System.out.println(path);
            maze[r][c] = true;
            return;
        }
        if (!maze[r][c]){
            return;
        }else {
            maze[r][c] = false;
        }

        if (r < maze.length-1){
           printPaths(maze, path+"D", r+1,c);
        }
        if (c<maze[0].length-1){
            printPaths(maze,path+"R",r,c+1);
        }

        if (r>0){
            printPaths(maze,path+"U",r-1,c);
        }
        if (c>0){
            printPaths(maze,path+"L", r,c-1);
        }
        maze[r][c] = true;
    }

    public static void printPathInMaze(boolean [][]maze, int r, int c, int [][] path, int step){
        if (r == maze.length -1 && c == maze[1].length -1){
            path[r][c] = step;
            for(int[]arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            maze[r][c] = true;
            path[r][c] = 0;
            return;
        }
        if (!maze[r][c]){
            return;
        }else {
            maze[r][c] = false;
            path[r][c] = step;
        }

        if (r < maze.length-1){
            printPathInMaze(maze, r+1, c,path,step+1);
        }
        if (c<maze[0].length-1){
            printPathInMaze(maze, r, c+1,path,step+1);
        }

        if (r>0){
            printPathInMaze(maze, r-1, c,path,step+1);
        }
        if (c>0){
            printPathInMaze(maze, r, c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
