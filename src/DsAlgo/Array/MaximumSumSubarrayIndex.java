package DsAlgo.Array;

public class MaximumSumSubarrayIndex {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = 0;
        int curSum = 0;
        int currSt = 0;
        int currEd = 0;
        int[] ans = new int[]{-1,-1};

        for(int i = 0; i<arr.length; i++){
            int sum = curSum + arr[i];
            if(sum < arr[i]){
                curSum = arr[i];
                currEd = currSt = i;
            }else{
                curSum += arr[i];
                currEd = i;
            }

            if(curSum>maxSum){
                maxSum = curSum;
                ans[0] = currSt;
                ans[1] = currEd;
            }
        }

        System.out.println(ans[0] + " " +  ans[1]);

    }
}
