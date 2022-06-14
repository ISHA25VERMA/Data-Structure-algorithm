package DsAlgo.BitManipulation;

import java.util.Arrays;

public class decimalToBinary {
    public static void main(String[] args) {
        binary(8);
        System.out.println();
        binary(2);
        System.out.println();
        binary(16);
        System.out.println();
        binary(7);
    }

    public static void binary(int n){
        int []binary = new int[40];
        int i = 0;
        while (n>0){
            int dig = n & 1;
            binary[i] = dig;
            i++;
            n = n>>1;
        }
        i--;
        for (int index = i;index >= 0; index--){
            System.out.print(binary[index]);
        }
    }
}
