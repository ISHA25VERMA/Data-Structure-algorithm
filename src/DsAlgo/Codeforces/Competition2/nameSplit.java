package DsAlgo.Codeforces.Competition2;

import java.util.Scanner;

public class nameSplit {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        int n = scan.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1;j++ ){
                System.out.print(j);
            }
            for(int j = 1; j<= 2*(i-1); j++){
                System.out.print("*");
            }
            for(int j = n-i+1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
