package DsAlgo.Graphs.Questions;

import java.util.LinkedList;
import java.util.Queue;

class PairN{
    int i;
    int j;
    public PairN(int i , int j){
        this.i = i;
        this.j = j;
    }
}

public class NearestExit {
    public static void main(String[] args) {
        char[][] maze = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
        int[] entrance = {1,0};
        System.out.println(nearestExit(maze, entrance));
    }

    public static int nearestExit(char[][] maze, int[] entrance) {
        Queue<PairN> q = new LinkedList<>();
        q.add(new PairN(entrance[0], entrance[1]));
        maze[entrance[0]][entrance[1]]= '+';

        int steps = 0;

        while(!q.isEmpty()){
            steps++;
            int n = q.size();
            for (int i =0; i<n; i++){
                int row = q.peek().i;
                int col = q.peek().j;
                q.remove();

                //2d array for all four directions
                int[][] dir = {{0,1}, {1,0}, {-1, 0}, {0,-1}};
                for(int j = 0; j<dir.length; j++){
                    int cur_row = row+dir[j][0];
                    int cur_col = col + dir[j][1];

                    if (cur_row<0 || cur_row>= maze.length || cur_col <0 || cur_col >=maze[0].length) continue;
                    if(maze[cur_row][cur_col] == '+') continue;

                    if(cur_row == 0 || cur_row == maze.length-1 || cur_col ==0 || cur_col ==maze[0].length-1) return steps;

                    maze[cur_row][cur_col] = '+';
                    q.add(new PairN(cur_row, cur_col));
                }
            }
        }
        return -1;
    }
}
