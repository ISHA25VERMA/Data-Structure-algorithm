package DsAlgo.Array;

import java.util.Scanner;

public class maximumSubarray {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] currSum = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = scan.nextInt();
            currSum[i] = 0;
        }

        currSum[0] = arr[0];
        for(int i =1; i<n;i++){
            currSum[i] = currSum[i-1] + arr[i];
        }

    }
}
