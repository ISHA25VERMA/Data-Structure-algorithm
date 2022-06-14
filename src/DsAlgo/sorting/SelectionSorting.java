package DsAlgo.sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {23,12,67,10,45,32};
        selectionSorting(arr);
        for (int element:
                arr) {
            System.out.print(element +", ");
        }
    }

    static void selectionSorting(int[] arr){
        boolean isSwapping = false;  //if the array is sorted, it has it won't run the loop second
                                     // time and save our time
        for (int i = 0; i< arr.length-1; i++){
            int min_index = i;
            for(int j = i+1 ; j < arr.length-1;j++){
                if (arr[j]<arr[i]){
                    isSwapping = true;
                    min_index = j;
                }
            }
            if(!isSwapping){
                break;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
