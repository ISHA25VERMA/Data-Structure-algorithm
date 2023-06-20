package DsAlgo.DivideandConquer;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 24, 56, 78,32};
        System.out.println(Arrays.toString(min_max(arr, 0, arr.length-1)));
    }

    public static int[]  min_max(int[] arr, int st, int ed){
        if (ed-st<= 1){
            return new int[]{Math.min(arr[st], arr[ed]), Math.max(arr[st], arr[ed])};
        }
        int mid = st +(ed-st)/2;
        int[] minMax = min_max(arr, st, mid);
        int[] secondMinMax = min_max(arr, mid+1, ed);

        return new int[]{Math.min(minMax[0], secondMinMax[0]), Math.max(minMax[1], secondMinMax[1])};
    }
}
