package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleHashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-- != 0){
            String p = scan.next();
            String h = scan.next();

            char[] sort = p.toCharArray();
            Arrays.sort(sort);
            String sorted = new StringBuilder(String.valueOf(sort)).toString();

            int l = p.length();
            int st = 0;

            boolean found = false;
            while(l<=h.length()){
                char[] hashSub = h.substring(st, l).toCharArray();
                Arrays.sort(hashSub);
                String hashSubSorted = new StringBuilder(String.valueOf(hashSub)).toString();

                if(hashSubSorted.equals(sorted)){
                    found = true;
                    System.out.println("YES");
                    break;
                }

                st++;
                l++;
            }

            if(!found){
                System.out.println("NO");
            }
        }
    }
}
