package DsAlgo.sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        mergeSort(arr,0,4);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int []leftSorted = mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int []rightSorted = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(leftSorted,rightSorted);
    }

    public static int[] merge (int []left, int []right){
        int []merged = new int[left.length+right.length];

        int i = 0, j = 0,k=0;
        while (i<left.length && j<right.length){
            if (left[i]<right[i]){
                merged[k] = left[i];
                i++; k++;
            }else {
                merged[k] = right[j];
                j++;k++;
            }
        }

        while (i<left.length){
            merged[k] = left[i];
            i++;k++;
        }

        while (j<right.length){
            merged[k] = right[j];
            j++;k++;
        }

        return merged;
    }

    public static void mergeSort(int[] arr, int st, int ed){
        if (st >= ed){
            return;
        }

        int mid = st + (ed-st)/2;

        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1,ed);

        merge(arr, st,mid,ed);
    }

    public static void merge (int []arr, int st, int mid, int ed){
        int []merged = new int[ed+1];
        int i = st, j = mid+1,k=0;
        while (i<=mid && j <= ed){
            if(arr[i]<arr[j]){
                merged[k+st] = arr[i];
                i++; k++;
            }else {
                merged[k+st] = arr[j];
                j++; k++;
            }
        }

        while (i<=mid){
            merged[k+st] = arr[i];
            i++; k++;
        }
        while (j<= ed){
            merged[k+st] = arr[i];
            j++; k++;
        }

        for(int n = st; n<=ed; n++){
            arr[n] = merged[n];
        }

    }
}
