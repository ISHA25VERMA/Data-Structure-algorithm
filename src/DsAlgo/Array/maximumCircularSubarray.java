package DsAlgo.Array;

import java.util.ArrayList;
import java.util.List;

public class maximumCircularSubarray {
    public static void main(String[] args) {
        int[] arr = {4,-4, 6, -6, 10, -11, 12};
        System.out.println(maxCircularSubarray(arr));
    }
    public static int kadaneAlgoSum(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length; i++){
            currentSum += arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum <0){
                currentSum = 0;
            }
        }

        return maxSum;
    }
    public static int maxCircularSubarray(int[] arr){

        int arrSum = 0;

        int nonWrapSum = kadaneAlgoSum(arr);

        int[] list = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            list[i]= -arr[i];
            arrSum += arr[i];
        }

        int wrapSum = arrSum + kadaneAlgoSum(list);

        return Math.max(wrapSum,nonWrapSum);
    }

}
