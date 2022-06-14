package DsAlgo.Recursions.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] maze = new boolean[n][n];
        System.out.println(knights(maze, 0, 0, 4));
    }

    public static int knights(boolean[][] maze, int row, int col, int knight){
        int count = 0;
        if (knight == 0){
            display(maze);
            System.out.println();
            count += 1;
            return count;
        }

        if (row > maze.length-1 || col > maze.length - 1){
            return count;
        }

        if (isSafe(maze, row, col)){
            maze[row][col] = true;
            if (col == maze.length -1){
                count+= knights(maze, row+1, col, knight-1);
            }else{
                count += knights(maze, row, col+1, knight-1);
            }
            maze[row][col] = false;
        }

        if (col == maze.length -1){
            count+= knights(maze, row+1, col, knight);
        }else{
            count += knights(maze, row, col+1, knight);
        }


        return count;
    }

    private static boolean isSafe(boolean[][] maze, int row, int col) {
        if (isValid(maze, row-2, col+1)){
            if (maze[row-2][col+1]){
                return false;
            }
        }

        if (isValid(maze, row-2, col-2)){
            if (maze[row-2][col-1]){
                return false;
            }
        }
        if (isValid(maze, row-1, col-2)) {
            if (maze[row-1][col-2]){
                return false;
            }
        }

        if (isValid(maze, row-1, col+2)) {
            if (maze[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] maze, int row, int col){
        if (row>= 0 && row<maze.length && col>=0 && col<maze[0].length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] maze) {
        for (boolean[] row : maze){
            for (boolean element : row){
                if (element){
                    System.out.print("K ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
