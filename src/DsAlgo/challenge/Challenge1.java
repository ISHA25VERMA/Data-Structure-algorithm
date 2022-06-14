package DsAlgo.challenge;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int glasses = 0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for (int j = 4; j<=num ; j++){
            int count = 0;
            for (int i = 2; i<=j/2; i++){
                if (j%i == 0 ){
                    if (check(i)){
                        count++;
                    }
                }
            }
            if (count == 2){
                glasses++;
            }
        }

        System.out.println(glasses);
    }

    public static Boolean check(int n){
        if (n ==2){
            return true;
        }
        for(int i=2 ; i < n ; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
