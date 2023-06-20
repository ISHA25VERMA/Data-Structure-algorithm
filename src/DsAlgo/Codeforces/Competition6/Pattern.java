package DsAlgo.Codeforces.Competition6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pattern {

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
    }
    public static void main(String[] args) {
        FastReader scan = new FastReader();
        int t = scan.nextInt();

        while(t!= 0){
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[][] matrix = new int[n][n];

            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }

            int diff = 0;

            for(int i = 0; i<n; i++){
                for(int j =0; j<n; j++){
                    if(matrix[i][j] != matrix[n-i-1][n-j-1]){
                        diff++;
                    }
                }
            }
            diff /= 2;

            if(diff == k){
                System.out.println("YES");
            }else if((diff < k) && ((n%2 == 0 && (k-diff)%2 == 0)|| (n%2 == 1))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            t--;
        }
    }
}
