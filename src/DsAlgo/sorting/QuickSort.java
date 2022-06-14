package DsAlgo.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,40,50,70};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        int st = low;
        int ed = high;
        int pivot = arr[st + (ed-st)/2];

        while (st<=ed){
            while (arr[st]<pivot){
                st++;
            }
            while (arr[ed]>pivot){
                ed--;
            }

            if(st<=ed){
                int temp = arr[st];
                arr[st] = arr[ed];
                arr[ed] = temp;
                st++;
                ed--;
            }
        }

        quickSort(arr,low, ed);
        quickSort(arr, st, high);
    }
}
