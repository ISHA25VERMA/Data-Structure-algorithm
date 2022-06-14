package DsAlgo.Recursions.Arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int []arr = {2,3,67,89,234};
        if (check(arr,0)){
            System.out.println("sorted");
        }else {
            System.out.println("not sorted");
        }
    }

    public static boolean check(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);
    }
}
