package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Arrays;
import java.util.Scanner;

public class OrInMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n  = scan.nextInt();
        int m = scan.nextInt();

        int[][] B = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                B[i][j] = scan.nextInt();
            }
        }

        int[][] A = new int[n][m];

        for(int i = 0; i<n; i++){
            Arrays.fill(A[i], 1);
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(B[i][j] == 0){
                    for(int k = 0; k<n; k++){
                        A[k][j] = 0;
                    }

                    for(int k = 0; k<m; k++){
                        A[i][k] = 0;
                    }
                }
            }
        }

        boolean yes = true;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                int ans = 0;
                for(int k = 0; k<n; k++){
                    ans |= A[k][j];
                }

                for(int k = 0; k<m; k++){
                    ans |= A[i][k];
                }

                if(ans != B[i][j]){
                    System.out.println("NO");
                    yes = false;
                    break;
                }
            }

            if(!yes){
                break;
            }
        }

        if(yes){
            System.out.println("YES");
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
