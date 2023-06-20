package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        boolean hash = true;
        boolean right = true;

        for(int i = 1; i<=n; i++){

            if(hash){
                for(int j = 1; j<=m; j++){
                    System.out.print("#");
                }

            }else{
                if(right){
                    for(int j = 1; j<=m; j++){
                        if(j == m){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }else{
                    for(int j = 1; j<=m; j++){
                        if(j == 1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
                right = !right;
            }

            hash = !hash;
            System.out.println();

        }
    }
}
