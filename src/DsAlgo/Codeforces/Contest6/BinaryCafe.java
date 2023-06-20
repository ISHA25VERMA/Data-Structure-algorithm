package DsAlgo.Codeforces.Contest6;

import java.util.Scanner;

public class BinaryCafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-- != 0){
            int n = scan.nextInt();
            int k = scan.nextInt();

            k = Math.min(k, 30);

            int ans = Math.min(n, (1<<k)-1)+1;

            System.out.println(ans);
        }
    }
}
