package DsAlgo.Codeforces.Competition5;

import java.util.Scanner;

public class InsertDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!=0){

            int n = scan.nextInt();
            int d = scan.nextInt();
            scan.nextLine();
            String str = scan.nextLine();
            boolean added = false;
            for(int i = 0; i<n; i++){
                if(d>(str.charAt(i)-'0')){
                    added = true;
                    System.out.println(str.substring(0,i)+d+str.substring(i));
                    break;
                }
            }
            if(!added){
                System.out.println(str+d);
            }
            t--;
//            long ansVal = Long.parseLong(d+str);
//            String ans = d+str;
//            for(int i = 1; i<n-1; i++){
//                String add = str.substring(0,i)+d+str.substring(i);
//                long val = Long.parseLong(add);
//                System.out.println("val : "+val);
//                if(Long.parseLong(add)>ansVal){
//                    ansVal = Long.parseLong(add);
//                    ans = add;
//                }
//            }
//            System.out.println(ans);
//            t--;
        }
    }
}
