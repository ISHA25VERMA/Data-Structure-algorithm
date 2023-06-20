package DsAlgo.Codeforces.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boredom {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastReader scan = new FastReader();

        int n = scan.nextInt();

        int[] arr = new int[n];
        int max = 0;
        long[] count = new long[100005];
        for(int i = 0 ;i<n; i++){
            arr[i] = scan.nextInt();
            max = Math.max(arr[i], max);
            count[arr[i]]++;
        }

        long[] dp = new long[100005];
        dp[0] = 0;
        dp[1] = count[1];

        for(int i= 2; i<=max; i++){
            dp[i] = Math.max(((count[i]*i)+dp[i-2]) , dp[i-1]);
        }
        System.out.println(dp[max]);
    }
//    private static int maxPoints(int[] arr, Map<Integer,Integer> map, int[] visited){
//
//        int ans = 0;
//
//        for(int i = 0;i<arr.length; i++){
//            if(visited[i] == 0){
//                if (!map.containsKey(arr[i])){
//                    visited[i] = 1;
//                    map.put(arr[i]+1, map.getOrDefault(arr[i]+1, 0)+1);
//                    map.put(arr[i]-1, map.getOrDefault(arr[i]-1, 0)+1);
//
//                    ans = Math.max(ans, arr[i]+maxPoints(arr, map, visited));
//                    map.put(arr[i]+1, map.get(arr[i]+1)-1);
//                    if(map.get(arr[i]+1) == 0){
//                        map.remove(arr[i]+1);
//                    }
//                    map.put(arr[i]-1, map.get(arr[i]-1)-1);
//                    if(map.get(arr[i]-1) == 0){
//                        map.remove(arr[i]-1);
//                    }
//                    visited[i] = 0;
//                }
//            }
//
//        }
//
//        return ans;
//    }
}
