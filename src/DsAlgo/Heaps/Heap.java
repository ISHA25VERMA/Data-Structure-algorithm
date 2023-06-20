package DsAlgo.Heaps;

import java.util.Arrays;

public class Heap {
    int[] arr;
    int size;

    public Heap(){
        size = 0;
        arr = new int[100];
        arr[0] = -1;

    }

    public void insert(int element){
        arr[++size] = element;
        int index = size;
        while(index>1){
            int parent = (index)/2;

            if(arr[parent] < arr[index]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;

                index = parent;
            }else{
                return;
            }
        }
    }



    public int delete(){
        if (size == 0){
            System.out.println("Cannot delete the heap is empty");
        }
        int pop = arr[1];
        arr[1] = arr[size];

        size--;

        //take root node to its correct position
        int i = 1;
        while(i<size){
            int leftindex = 2*i;
            int rightindex = 2*i+1;

            if (leftindex<size && arr[i]<arr[leftindex]){
                int temp = arr[i];
                arr[i] = arr[leftindex];
                arr[leftindex] = temp;
            }else if(rightindex<size && arr[i]<arr[rightindex]){
                int temp = arr[i];
                arr[i] = arr[rightindex];
                arr[rightindex] = temp;
            }else {
                return pop;
            }

        }

        return pop;
    }

    public void print(){
        for(int i =1; i<=size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
