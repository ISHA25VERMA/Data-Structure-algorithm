package DsAlgo.Codeforces.Competition1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while(n!=0){
            int size = scan.nextInt();
            int[] arr = new int[size];

            for(int i = 0; i<size; i++){
                arr[i] = scan.nextInt();
            }

            List<List<Integer>> perm = new ArrayList<>();
            int[] visited = new int[size];

            if(!permutations(arr, new ArrayList<>(), perm, visited)){
                System.out.println("NO");
            }
            n--;
        }
    }

    private static boolean permutations(int[] nums, List<Integer> cur, List<List<Integer>> res,  int[] visited){
        if(cur.size() == nums.length) {
            boolean isUgly = false;
            int sum = 0;
            for(int j = 0 ;j<cur.size(); j++){
                if(cur.get(j) == sum){
                    isUgly = true;
                    break;
                }

                sum += cur.get(j);
            }

            if(!isUgly){
                System.out.println("YES");
                for(int num : cur){
                    System.out.print(num+" ");
                }
                System.out.println();

                return true;
            }else{
                return false;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                cur.add(nums[i]);
                if(permutations(nums, cur, res, visited)){
                    return true;
                }
                permutations(nums, cur, res, visited );
                visited[i] = 0;
                cur.remove(cur.size()-1);
            }
        }
        return false;
    }
}
