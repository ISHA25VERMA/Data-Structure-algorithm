package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class MiddleOfTheContest {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();


        int h1 = Integer.parseInt(str1.substring(0, 2));
        int m1 = Integer.parseInt(str1.substring(3, 5));

        int h2 = Integer.parseInt(str2.substring(0, 2));
        int m2 = Integer.parseInt(str2.substring(3, 5));

        int t1 = h1*60 + m1;
        int t2 = h2*60 +m2;

        int diff = (t2+t1)/2;

        int ansHour = diff/60;
        int ansMin = diff%60;

        if(ansHour<10){
            System.out.print("0"+ansHour+":");
        }else{
            System.out.print(ansHour+":");
        }

        if(ansMin<10){
            System.out.print("0"+ansMin);
        }else {
            System.out.print(ansMin);
        }
    }
}
