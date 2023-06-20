package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRounds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();


        while(t-- != 0){
            List<String> list = new ArrayList<>();
            int num = scan.nextInt();
            StringBuilder str = new StringBuilder();
            while (num >0){
                int rem = num %10;

                if(rem != 0){
                    list.add(rem + str.toString());
                    str.append('0');
                }else{
                    str.append(rem);
                }

                num /= 10;
            }

            System.out.println(list.size());

            for(String roundOff : list){
                System.out.print(roundOff+" ");
            }
            System.out.println();
        }
    }
}
