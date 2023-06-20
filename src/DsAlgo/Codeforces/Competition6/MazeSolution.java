package DsAlgo.Codeforces.Competition6;

import java.util.Scanner;

public class MazeSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!= 0){

            int row = scan.nextInt();
            int col = scan.nextInt();

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int m = pathBlocks(x1, y1, row, col);
            int n = pathBlocks(x2, y2, row, col);

            if(m<n){
                System.out.println(m);
            }else {
                System.out.println(n);
            }

            t--;
        }

    }

    private static int pathBlocks(int x, int y, int row, int col){
        if((x == 1 || x == row) && (y == 1 || y == col)){
            return 2;
        }else if(x == 1|| x == row || y == 1 || y == col){
            return 3;
        }

        return 4;
    }
}
