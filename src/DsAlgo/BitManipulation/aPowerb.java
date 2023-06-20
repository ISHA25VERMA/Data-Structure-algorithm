package DsAlgo.BitManipulation;

//a^b

import java.util.Scanner;

public class aPowerb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base = scan.nextInt();
        int power = scan.nextInt();

        System.out.println(power(base, power));
    }

    private static int power(int base, int power){
        int ans = 1;
        int b = base;

        while(power!=0){
            int bit = power&1;
            if(bit == 1){
                ans = ans * b;
            }

            b = b*b;
            power = power>>1;
        }

        return ans;
    }

    private static int calcPower(int base, int power){
        if(power == 0){
            return 1;
        }
        int res = calcPower(base, power>>1);
        if((power&1) == 1){
            return res*res*base;
        }else{
            return res*res;
        }
    }
}
