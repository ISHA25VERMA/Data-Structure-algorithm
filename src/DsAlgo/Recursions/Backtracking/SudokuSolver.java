package DsAlgo.Recursions.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
    }

    public static boolean solver (char[][] sudoku){
        int n = sudoku.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft  = true;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n; j++){
                if (sudoku[i][j] == '.'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (!emptyLeft){
                break;
            }
        }
        if (emptyLeft){
            return true;
        }

        //backtrack
        for (int number = 1; number<n; number++){
            if (isSafe(sudoku, row, col, (char) (number+'0'))){
                sudoku[row][col] = (char) (number+'0');
                solver(sudoku);
            }
            if (solver(sudoku)){
                display(sudoku);
                return true;
            }else{
                sudoku[row][col] = '.';
            }
        }

        return false;
    }

    private static void display(char[][] sudoku) {
        for (char[] arr :sudoku){
            for (char num : arr){
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] sudoku, int row, int col, char num){
        // row
        for (int i = 0; i<9;i++){
            if (sudoku[row][i] == num){
                return false;
            }
        }

        //col
        for (int i = 0; i<9;i++){
            if (sudoku[i][col]==num){
                return false;
            }
        }

        //for 3X3 block
        int stcol = col - (col%3);
        int strow = row - (row%3);
        for (int i = strow; i<strow+3;i++){
            for (int j = stcol;j<stcol+3;j++){
                if (sudoku[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
