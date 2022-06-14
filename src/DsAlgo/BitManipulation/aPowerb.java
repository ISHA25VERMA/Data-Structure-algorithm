package DsAlgo.BitManipulation;

//a^b

import java.util.Scanner;

public class aPowerb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base = scan.nextInt();
        int power = scan.nextInt();

        int ans = 1;

        while (power>0){
            if((power & 1) == 1){
                ans = ans*base;
            }
            base *= base;
            power = power>>1;
        }

        System.out.println(ans);
    }
}
