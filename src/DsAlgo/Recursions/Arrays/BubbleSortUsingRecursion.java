package DsAlgo.Recursions.Arrays;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {8,56,34,89,12,45,22};
        sort(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int n, int cases){
        if (n < 0){
            return;
        }

        if (n > cases){
            if (arr[cases] > arr[cases+1]){
                int temp = arr[cases];
                arr[cases] = arr[cases+1];
                arr[cases+1] = temp;
            }
            sort(arr,n,cases+1);
        }else {
            sort(arr,n-1,0);
        }
    }
}
