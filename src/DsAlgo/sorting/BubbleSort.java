package DsAlgo.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,12,67,10,45,32};
        bubbleSorting(arr);
        for (int element:
             arr) {
            System.out.println(element +", ");
        }
    }
    static void bubbleSorting(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for (int j = 1 ; j < arr.length-i; j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
