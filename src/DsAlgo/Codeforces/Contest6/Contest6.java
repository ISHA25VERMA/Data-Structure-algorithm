package DsAlgo.Codeforces.Contest6;

import java.util.Scanner;
//import java.util.Stack;

public class Contest6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t!= 0){
            int n = scan.nextInt();

            String str = scan.next();
            scan.nextLine();
//            System.out.println(str);

            char ch = str.charAt(0);

            StringBuilder ans = new StringBuilder();


            for(int i = 1; i<str.length(); i++){
                if(str.charAt(i) == ch){
                    ans.append(ch);
                    if(i+1< str.length()) {
                        ch = str.charAt(i + 1);
                        i++;
                    }
                }
            }
            System.out.println(ans.toString());
            t--;
        }
    }
}
