package DsAlgo.cycleSorting;

import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr = {3,5,2,1,4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CyclicSort(int[]arr){
        int i = 0;
        while (i< arr.length){
            if (i != arr[i]-1){
                int temp = arr[arr[i]-1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
    }



    public static int getMaximumMEX(List<Integer> arr) {
        // Write your code here
        int[] list = new int[arr.size()];
        for (int i = 0; i<list.length; i++){
            int temp = list[list[i]];
            list[list[i]] = list[i];
            list[i] = temp;
        }
        for (int i = 0; i<list.length; i++){
            if (list[i] != i){
                swap(list[i], list[list[i]]);
            }
        }



        for (int i =0; i<list.length; i++){
            if (list[i]!=i && list[i]>list.length){
                list[i] = i;
            }
            else if (i!= list[i]){
                return i;
            }
        }

        return -1;
    }

    public static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
