package DsAlgo.Array;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2,4,7,11,14,16,20,21};
        pairSum(arr,31);
    }
    public static void pairSum(int[] arr , int k){
        int st = 0;
        int ed = arr.length-1;

        while(st<=ed ){
            int sum = arr[st]+arr[ed];
            if (sum == k){
                System.out.println(st+" "+ed);
                return;
            }else if (sum<k){
                st++;
            }else {
                ed--;
            }
        }
    }
}
