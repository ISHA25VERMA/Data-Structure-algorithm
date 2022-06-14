package DsAlgo.Recursions.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,23,56,78,130};
        System.out.println(search(arr, 3, 0, arr.length-1));
    }

    public static int search(int []arr, int target, int st , int ed){
            if (st>ed){
                return -1;
            }
            int mid = st + (ed-st)/2;
            if (arr[mid] == target){
                return  mid;
            }
            if (arr[mid]<target){
                return search(arr, target, mid+1, ed);
            }
            return search(arr, target, st, mid-1);
    }
}
