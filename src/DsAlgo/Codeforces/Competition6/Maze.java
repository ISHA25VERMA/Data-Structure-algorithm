package DsAlgo.Codeforces.Competition6;

import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!=0){
            int row = scan.nextInt();
            int col = scan.nextInt();

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int ans = 0;

            int[][] visited = new int[row][col];
            if(path(x1-2, y1-1, x2, y2, new int[row][col], visited)){
                ans++;
            }

            if(path(x1-1, y1-2, x2, y2,  new int[row][col], visited)){
                ans++;
            }

            if(path(x1, y1-1, x2, y2,  new int[row][col], visited)){
                ans++;
            }

            if(path(x1-1, y1, x2, y2,  new int[row][col], visited)){
                ans++;
            }

            System.out.println(ans);
            t--;
        }
    }

    static boolean path(int row, int col, int erow, int ecol, int[][] maze, int[][] visited){
        if(row<0 || col<0 || row>=maze.length || col>= maze[0].length){
            return false;
        }
        if(maze[row][col] == 1 || visited[row][col] == 1){
            return false;
        }

        maze[row][col] = 1;

        if (row == erow-1 && col == ecol -1){
            return  true;
        }

        if (row < maze.length-1 && path(row+1,col,erow, ecol, maze, visited )){
            return true;
        }
        else if (col<maze[0].length-1 && path(row,col+1, erow, ecol, maze, visited)){
            return true;
        }
        else if (row > 0 && path(row-1, col, erow, ecol, maze, visited)){
            return true;
        }
        else if (col>0 && path(row, col-1, erow, ecol, maze, visited)){
            return true;
        }
        visited[row][col] = 1;
        maze[row][col] = 0;
        return false;
    }
}
