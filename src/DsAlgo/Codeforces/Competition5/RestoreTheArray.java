package DsAlgo.Codeforces.Competition5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RestoreTheArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!= 0){
            int n = scan.nextInt();
            int[] arr = new int[n-1];
            for(int i = 0; i<n-1; i++){
                arr[i] = scan.nextInt();
            }

            int[] ans = new int[n];
            ans[0] = arr[0];
            ans[n-1] = arr[n-2];

            int i = 0;
            for( ; i<n-2; i++){
                ans[i+1] = Math.min(arr[i], arr[i+1]);
            }

            i = 0;
            for(; i<n; i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
//            List<int[]> list = new ArrayList<>();
//            solve(0, arr, new int[n], list, n);
//            int i = 0;
//            for( ; i<n-1; i++){
//                System.out.print(list.get(0)[i]+" ");
//            }
//            System.out.println(list.get(0)[i]);
            t--;
        }
    }
//
//    private static void solve(int index, int[] sol,int[] cur, List<int[]> list, int n){
//        if(index > n-2){
//            int[] newArray = new int[n];
//            System.arraycopy(cur, 0, newArray, 0, n);
//            list.add(newArray);
//            return;
//        }
//        if(list.size() >= 1){
//            return;
//        }
//        if(index==0 || (sol[index-1] == Math.max(cur[index-1], sol[index]))){
//            int temp = cur[index];
//            cur[index] = sol[index];
//            solve(index+1, sol, cur, list, n);
//            cur[index] = temp;
//            if(list.size() >= 1){
//                return;
//            }
//        }
//        int temp = cur[index];
//        cur[index+1] = sol[index];
//        solve(index+1, sol, cur, list, n);
//        cur[index+1] = temp;
//
//    }
}
