package DsAlgo.Codeforces.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class KefaAndPark {
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
        int m = scan.nextInt();

        int[] cats = new int[n];

        for (int i = 0; i<n; i++){
            cats[i] = scan.nextInt();
        }

        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i<n-1; i++){
            int u = scan.nextInt();
            int v = scan.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

//        int ans = dfs(1, adj, m, 0, cats);
        int[] visited = new int[n];
        visited[0] = 1;
        System.out.println(dfs(1, adj, m, 0, cats, visited));
    }

    private static int dfs(int node, List<List<Integer>> adj, int m, int k, int[] cat, int[] visited){
        if(cat[node-1] == 1){
            if(k<m){
                k++;
            }else {
                return 0;
            }
        }else {
            k  = 0;
        }

        if(adj.get(node).size() == 1 && node!= 1){
            return 1;
        }

        int ans = 0;

        for(int child : adj.get(node)){
            if(visited[child-1] == 0) {
                visited[child-1] = 1;
                ans += dfs(child, adj, m, k, cat, visited);
            }
        }

        return ans;

    }
}
