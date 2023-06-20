package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class PalindromicTwist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t--!= 0){
            int n = scan.nextInt();
            String str = scan.next();

            boolean isPossible = true;

            for(int i = 0; i<n/2; i++){
                int a = str.charAt(i);
                int b = str.charAt(n-i-1);

                if(a-b != 0 && Math.abs(a-b) != 2){
                    isPossible = false;
                    System.out.println("NO");
                    break;
                }
            }

            if(isPossible){
                System.out.println("YES");
            }
        }
    }
}
