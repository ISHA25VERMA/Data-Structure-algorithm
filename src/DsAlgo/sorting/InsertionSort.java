package DsAlgo.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23,12,67,10,45,32};
        InsertionSorting(arr);
        for (int element:
                arr) {
            System.out.print(element +", ");
        }
    }
    static void InsertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

        // this can be another way to write the same loop
//        for (int i = 1;i<n;i++){
//            int current = arr[i];
//            int j = i-1;
//
//            while(arr[j]>current && j >=0){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = current;
//        }
//    }

//    static void sorting (int []arr){
//        for (int i = 1; i<arr.length; i++){
//            for (int j = i-1; j>=0; j--){
//                if (arr[j+1]<arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }else{
//                    break;
//                }
//            }
//        }
//    }
}
