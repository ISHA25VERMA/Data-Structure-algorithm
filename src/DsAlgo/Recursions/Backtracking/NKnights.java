package DsAlgo.Recursions.Backtracking;

import java.util.List;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] maze = new boolean[5][5];
        System.out.println(knights(maze, 0, 0, 13));
    }

    public static int knights(boolean[][] maze, int row, int col, int knights){
        int count = 0;
        if (knights == 0){
            count += 1;
            return count;
        }

        if (row == maze.length-1 && col == maze.length-1){
            return count;
        }

        if(col == maze.length){
            count += knights(maze, row+1, 0, knights);
            return count;
        }


        if (isSafe(maze, row, col)){
            maze[row][col] = true;
            count += knights(maze, row, col+1, knights-1);
            maze[row][col] = false;
        }

        count += knights(maze, row, col+1, knights);

        return count;
    }

    public static boolean isSafe(boolean[][] maze, int row, int col){
        if (isValid(maze, row-2, col-1)){
            if(maze[row-2][col-1]){
                return false;
            }
        }

        if (isValid(maze, row-2, col+1)){
            if(maze[row-2][col+1]){
                return false;
            }
        }

        if (isValid(maze, row-1, col-2)){
            if(maze[row-1][col-2]){
                return false;
            }
        }

        if (isValid(maze, row-1, col+2)){
            if(maze[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[][] maze, int row, int col){
        if (row>=0 && row<maze.length && col >=0 && col<maze.length){
            return true;
        }

        return false;
    }

}
