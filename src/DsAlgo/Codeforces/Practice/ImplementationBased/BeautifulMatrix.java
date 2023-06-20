package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean foundAns = false;

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                int num = scan.nextInt();

                if(num == 1){
                    int ans = 0;
                    ans += Math.abs(i-3);
                    ans += Math.abs(j-3);

                    System.out.println(ans);


                }

            }
        }
    }
}
