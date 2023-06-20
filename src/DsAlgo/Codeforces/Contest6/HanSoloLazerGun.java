package DsAlgo.Codeforces.Contest6;

import DsAlgo.Codeforces.Competition5.InsertDigit;

import java.util.*;

class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class HanSoloLazerGun {
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static Pair getReducedForm(int dy, int dx)
    {
        int g = gcd(Math.abs(dy), Math.abs(dx));

        //    get sign of result
        boolean sign = (dy < 0) ^ (dx < 0);
        Pair res = new Pair(0, 0);

        if (sign) {
            res.x = -Math.abs(dy) / g;
            res.y = Math.abs(dx) / g;
        }
        else {
            res.x = Math.abs(dy) / g;
            res.y = Math.abs(dx) / g;
        }
        return res;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//
//        Set<String> st = new HashSet<String>();
//
//        Pair temp;
//        int minLines = 0;
//
//
//        for(int i = 0; i<n; i++){
//            int xi = scan.nextInt();
//            int yi = scan.nextInt();
//
//            int delx  = xi-x;
//            if(delx == 0){
//                divby0 = 1;
//            }else {
//                double slopeVal = (yi-y)/(xi-x);
//                map.put(slopeVal, map.getOrDefault(slopeVal, 0)+1);
//            }
//
//
//
//        }
//
//        int ans = map.size() + divby0;


//        System.out.println(ans);
    }
}
