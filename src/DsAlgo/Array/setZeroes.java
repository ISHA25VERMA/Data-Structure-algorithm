package DsAlgo.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class setZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        for (int[] list : arr){
            System.out.println(Arrays.toString(list));
        }

    }

    public static void setZeroes(int matrix[][], int  row, int col){
        for (int i = 0; i<matrix.length; i++){
            for (int  j = 0; j<matrix[i].length;j++){
                if ((i == row) ||( j == col)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean [][] flag = new boolean[row][col];

        for (int i = 0; i<matrix.length; i++){
            for (int  j = 0; j<matrix[i].length; j++){
                if (matrix[i][j] == 0){
                    flag[i][j] = true;
                }
            }
        }

        for (int i = 0; i<flag.length; i++){
            for (int  j = 0; j<flag[i].length; j++){
                if (flag[i][j] == true){
                    setZeroes(matrix, i, j);
                }
            }
        }
    }
}
