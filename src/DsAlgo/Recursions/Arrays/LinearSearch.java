package DsAlgo.Recursions.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {9, 78, 34, 62, 3, 12, 8};
        System.out.println(search(arr, 5, 0));
    }

    public static int search (int []arr,int target, int index){
        if (arr[index] == target){
            return index;
        }else if (index == arr.length-1){
            return -1;
        }else {
            return search(arr,target, index+1);
        }
    }
}
