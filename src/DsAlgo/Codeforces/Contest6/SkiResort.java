package DsAlgo.Codeforces.Contest6;

import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t!= 0){
            long n = scan.nextLong();
            long k = scan.nextLong();
            long maxTemp = scan.nextLong();

            long ans = 0;
            long curWindowLength = 0;

            for(int i = 0; i<n; i++){
                long temp = scan.nextInt();

                if(temp<=maxTemp){
                    curWindowLength++;
                }else{
                    if(curWindowLength>=k){
                        ans += ((curWindowLength-k+1)*(curWindowLength-k+2))/   2;
                    }
                    curWindowLength = 0;

                }
            }

            if(curWindowLength>= k){
                ans += ((curWindowLength-k+1)*(curWindowLength-k+2))/2;
            }
//            curWindowLength = 0;

            System.out.println(ans);
            t--;
        }
    }
}
