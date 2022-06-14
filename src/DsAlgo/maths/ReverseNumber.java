package DsAlgo.maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans = 10*ans + digit;
            n /= 10;
        }

        System.out.println(ans);
    }
}
