package DsAlgo.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int []nums1 = {3,1,2};
        int []nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = -1;

        int l1 = nums1.length;
        int l2 = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int l = Math.min(l1,l2);

        if (l == l1){
            int j =0;
            for (int i = 0; i<l1; i++){
                if (n == nums1[i]){
                    continue;
                }
                n = nums1[i];
                for (; j<l2 && nums2[j]<=n ; j++){
                }
                if (nums2[j-1] == n){
                    ans.add(n);
                }
            }
        }else{
            int j =0;
            for (int i = 0; i<l2; i++){
                if (n == nums2[i]){
                    continue;
                }
                n = nums2[i];
                for (; j<l1 && nums1[j]<=n ; j++){
                }
                if (nums1[j-1] == n){
                    ans.add(n);
                }
            }
        }

        int size = ans.size();

        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = ans.get(i);
        }

        return arr;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int l1 = nums1.length;
        int l2 = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int l = Math.min(l1,l2);

        if (l == l1){
            int j =0;
            for (int i = 0; i<l1; i++){
                int n = nums1[i];
                for (; j<l2 && nums2[j]<n ; j++){
                }
                if (j<nums2.length && nums2[j-1] == n){
                    ans.add(n);
                    j++;
                }
            }
        }else{
            int j =0;
            for (int i = 0; i<l2; i++){
                int n = nums2[i];
                for (; j<l1 && nums1[j]<n ; j++){
                }
                if (j<nums1.length && nums1[j] == n){
                    ans.add(n);
                    j++;
                }
            }
        }

        int size = ans.size();

        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = ans.get(i);
        }

        return arr;
    }
}
