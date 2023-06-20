package DsAlgo.Heaps;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeapTest {
    static void heapify(int[] arr, int n, int i){
        int largest =i;
        int lefti = 2*i;
        int righti = 2*i +1;

        if(lefti<n && arr[lefti]>arr[largest]){
            largest = lefti;
        }
        if(righti<n&& arr[righti]>arr[largest]){
            largest = righti;
        }

        if(largest!= i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }

    }
    public static void main(String[] args) {
        Heap myheap = new Heap();
        myheap.insert(50);
        myheap.insert(55);
        myheap.insert(53);
        myheap.insert(52);
        myheap.insert(54);
        myheap.print();

        int[] arr = {-1, 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n = arr.length;
        for(int i= n/2 ; i>0; i--){
            heapify(arr, n, i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
