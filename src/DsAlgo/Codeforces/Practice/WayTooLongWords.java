package DsAlgo.Codeforces.Practice;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n > 0){
            String str = scan.nextLine();
            if(str.length()>10){
                int length = str.length()-2;

                System.out.println(""+str.charAt(0)+length+str.charAt(str.length()-1));
            }else{
                System.out.println(str);
            }
            n--;
        }
    }
}
