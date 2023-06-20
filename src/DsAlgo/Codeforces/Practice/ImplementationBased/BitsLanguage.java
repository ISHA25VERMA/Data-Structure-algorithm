package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class BitsLanguage {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = scan.nextInt();
        int x = 0;
        while(n!= 0){
            String str = scan.next();

            if(str.contains("++")){
                x++;
            }else{
                x--;
            }

            n--;
        }

        System.out.println(x);
    }
}
