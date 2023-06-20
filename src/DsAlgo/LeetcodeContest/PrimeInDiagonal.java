package DsAlgo.LeetcodeContest;

public class PrimeInDiagonal {
    public static void main(String[] args) {

    }
    public int diagonalPrime(int[][] nums) {

        int ans = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i][i]>ans){
                if(isPrime(nums[i][i])){
                    ans = nums[i][i];
                }
            }
            if(nums[i][nums.length-i-1]>ans){
                if(isPrime(nums[i][nums.length-i-1])){
                    ans = nums[i][i];
                }
            }
        }

        return ans;
    }
    public boolean isPrime(int n){
        boolean isPrime = true;
        if (n<=1){
            return false;
        }
        int i = 2;
        while (i*i <= n){
            if(n%i == 0){
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}
