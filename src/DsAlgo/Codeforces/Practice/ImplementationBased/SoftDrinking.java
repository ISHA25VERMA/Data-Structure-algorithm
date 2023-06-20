package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();
        int np = scan.nextInt();

        int totalLemonSlices = c*d;
        int juiceQty = k*l;

        int ToastsOutOfJuice = juiceQty/nl;
        int ToastsOutOfSalt = p/np;

        int toastsCanBeMade = Math.min(totalLemonSlices, Math.min(ToastsOutOfJuice, ToastsOutOfSalt));

        System.out.println(toastsCanBeMade/n);
    }
}
