package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class BalancedRating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int del = 1;

        for(int i = 0; i<n; i++){
            int rating = scan.nextInt();
            if(rating %2 == 0){
                System.out.println(rating/2);
            }else{
                System.out.println((rating+del)/2);
                del *= -1;
            }
        }

    }
}
