package DsAlgo.Recursions.Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {34,12,32,67,54,89,42,21};
        selectionSortUsingRecursion(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSortUsingRecursion(int [] arr, int pass, int index, int maxIndex){
        if(pass<=0){
            return;
        }
        if (pass>=index){
            if(arr[index] >= arr[maxIndex]){
                selectionSortUsingRecursion(arr,pass,index+1,index);
            }else {
                selectionSortUsingRecursion(arr,pass,index+1, maxIndex);
            }

        }else{
            int temp = arr[pass];
            arr[pass] = arr[maxIndex];
            arr[maxIndex] = temp;
            selectionSortUsingRecursion(arr,pass-1,0,0);
        }
    }
}
