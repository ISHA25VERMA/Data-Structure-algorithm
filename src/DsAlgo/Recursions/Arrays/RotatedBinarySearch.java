package DsAlgo.Recursions.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr = {5,6,1,2,3,4};
        System.out.println(binarySearch(arr,0,arr.length-1,6));
    }
    public static int binarySearch(int[] arr, int st, int ed, int target){
        int mid = st + (ed-st)/2;
        if (st>ed){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }
        if (arr[st] < arr[mid]){
            if (target>= arr[st] && target < arr[mid]){
                return binarySearch(arr, st, mid-1, target);
            }else {
                return binarySearch(arr, mid+1, ed, target);
            }
        }else if (target > arr[mid] && target <= arr[ed] ){
            return binarySearch(arr, mid+1, ed, target);
        }else {
            return binarySearch(arr, st, mid-1, target);
        }
    }
}
