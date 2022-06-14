package DsAlgo.cycleSorting;


//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

public class MissingNumber {
    public static void main(String[] args) {
        int []nums = {0};
        System.out.println("Missing number: "+missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if (nums[i] == nums.length){
                i++;
            }else if(nums[i] != i ){
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }

        for (int j = 0; j<nums.length; j++){
            if (nums[j] != j){
                return j;
            }
        }

        return nums.length;
    }
}
