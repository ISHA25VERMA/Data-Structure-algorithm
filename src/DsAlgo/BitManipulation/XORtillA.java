package DsAlgo.BitManipulation;

//find xor of numbers from 0 to a;

import java.util.Scanner;

public class XORtillA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        int n = scan.nextInt();
        if  (n%4 == 0){
            ans  = n;
        }else if(n%4 == 1){
            ans = 1;
        }else if(n%4 == 2){
            ans = n+1;
        }else {
            ans = 0;
        }

        System.out.println(ans);
    }
}
