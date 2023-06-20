package DsAlgo.Codeforces.Practice;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int ans = 0;
        while(n!= 0){

            int a = 3;
            int count = 0;
            while(a!= 0){
                if(scan.nextInt() == 1){
                    count++;
                }
                a--;
            }
            if(count>=2){
                ans ++;
            }
            n--;
        }

        System.out.println(ans);
    }
}
