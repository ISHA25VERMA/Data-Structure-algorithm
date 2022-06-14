package DsAlgo.BitManipulation;


//1 1 2 2 2 3 3 3 3 3 3
// ans = 1

import java.util.Arrays;

//3 2 1 3 2 1 2 3 1 4 4 4 4
// ans = 4
public class ArrayOccurrenceOfNumberThrice {
    public static void main(String[] args) {
        int []arr = {3,2,1,3,2,1,2,3,1,4,4,4,4};
        System.out.println(1<<2);
        System.out.println(NumberWithNotThreeOccurrence(arr));

    }

    public static int NumberWithNotThreeOccurrence(int []arr){
        byte[] bytes = new byte[32];

        for (int i = 0; i<arr.length-1; i++){
            System.out.println(Arrays.toString(bytes));
            for(int j =0 ; j<32;j++) {

                System.out.println(arr[i]&(1<<j));
//                System.out.print( bytes[j] + (arr[i]&(1<<j)));
//                bytes[j] = (byte)(bytes[j] + (arr[i]&(1<<(j-1))));
//                bytes[j] %= 3;
//                bytes[j] = (byte)(bytes[j]+())
                bytes[j] = (byte) ((bytes[j] + ithBit(arr[i],j))%3);
            }
            System.out.println(Arrays.toString(bytes));
        }

        int ans = 0;
        for (int i = 0; i<32; i++){
            if (bytes[i]!=0){
                ans+= 1 * Math.pow(2,i);
            }
        }

        return ans;
    }

    public static int ithBit(int n, int i){
//        int i1 = n & (int) (Math.pow(2, i - 1));
        int i1 = n & (1<<(i-1));     // mask = 1<<(i-1) => 1<<4 = 1000
        if(i1 == 0){
            return 0;
        }
        return 1;
    }
}
