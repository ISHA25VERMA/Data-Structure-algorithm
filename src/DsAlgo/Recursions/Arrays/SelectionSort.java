package DsAlgo.Recursions.Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {34,12,32,67,54,89,42,21};
        BubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr, int pass, int index){
        if (pass<=0){
            return ;
        }
        if (pass==index){
            BubbleSort(arr, pass-1, 0);
            return;
        }
        if (arr[index]>arr[index+1]){
            swap(arr, index, index+1);
        }
        BubbleSort(arr, pass, index+1);
    }

    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
