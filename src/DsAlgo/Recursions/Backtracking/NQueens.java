package DsAlgo.Recursions.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean [][]board = new boolean[n][n];
//        for(boolean[] arr: board){
//            for (boolean element : arr){
//                System.out.print(element);
//            }
//            System.out.println();
//        }
        System.out.println(queens(board,0));
    }
    public static int queens(boolean[][] board, int row){
        int count = 0;
        if (row == board.length){
            display(board);
            System.out.println();
            count += 1;
            return count;
        }

        //placing the queen and checking
        for (int col = 0; col<board[0].length;col++){
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //check vertical row
        for (int i = 0; i<row; i++){
            if (board[i][col]){
                return false;
            }
        }

        // check diagonal right
        for(int r = row-1, c = col+1; c<board[0].length && r >= 0 && c>= 0;r-- ,c++){
            if (board[r][c]){
                return false;
            }
            if (r==0){
                break;
            }
        }

        //check diagonal left

        for(int r = row, c = col; c>=0 && r>= 0; r--, c--){
            if (board[r][c]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
