package DsAlgo.cycleSorting;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums of length n where all the integers of nums are in the range
//[1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//You must write an algorithm that runs in O(n) time and uses only constant extra space.

public class findDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicateElementsInArray(nums);
    }
    public static void findDuplicateElementsInArray(int[] nums) {
        int i = 0;
        while(i<nums.length) {
            if (nums[i] > nums.length) {
                i++;
            } else if(i+1 != nums[i] && nums[nums[i] - 1] == nums[i]) {
                i++;
            } else if (nums[i] - 1 != i) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for(int j = 0; j<nums.length; j++){
            if (nums[j] != j+1){
                System.out.println(nums[j]);
            }
        }
    }
}
