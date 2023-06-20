package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();
        String str = String.valueOf(num);




            StringBuilder ans = new StringBuilder();

            while(num > 0){
                long dig = num%10;

                if(9-dig < dig){
                    ans.append(9-dig);
                }else{
                    ans.append(dig);
                }

                num /= 10;

            }

            ans = ans.reverse();
//            System.out.println(ans);
            if(ans.charAt(0) == '0'){
                ans.replace(0, 1, "9");
            }

        System.out.println(ans.toString());
    }
}
