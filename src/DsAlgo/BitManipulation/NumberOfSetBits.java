package DsAlgo.BitManipulation;

import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int n = scan.nextInt();

        System.out.println(Integer.toBinaryString(n));
        while (n>0){
            count++;
            n -= n & (-n);// -n = n-1
        }

        System.out.println(count);
    }
}
