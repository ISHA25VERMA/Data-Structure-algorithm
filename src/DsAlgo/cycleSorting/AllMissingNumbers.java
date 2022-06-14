package DsAlgo.cycleSorting;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
//        for(Integer element:missing){
//            System.out.println(element);
//        }

    }
    public static void findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if (nums[i] > nums.length){
                i++;
            }else if (nums[nums[i]-1] == nums[i]){
                i++;
            } else if(nums[i]-1 != i ){
                int temp = nums[nums[i]-1];
                nums[nums[i] -1] = nums[i];
                nums[i] = temp;
            }
        }

        List<Integer> missing = new ArrayList<Integer>();

        for (int j = 0; j<nums.length; j++){
            if (nums[j]-1 != j){
                System.out.println(j+1);
            }
        }
    }
}
