package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int ans = 0;
        scan.nextLine();
        while(n-- > 0){
            String str  = scan.nextLine();

            if(str.equals("Tetrahedron")){
                ans += 4;
//                System.out.println("t");
            }else if(str.equals("Cube")){
                ans += 6;
//                System.out.println("c");
            }else if(str.equals("Octahedron")){
                ans += 8;
//                System.out.println("o");
            }else if(str.equals("Dodecahedron")){
                ans += 12;
//                System.out.println("d");
            }else{
                ans+= 20;
//                System.out.println("e");
            }
        }

        System.out.println(ans);
    }
}
