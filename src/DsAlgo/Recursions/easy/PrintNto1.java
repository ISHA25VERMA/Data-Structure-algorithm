package DsAlgo.Recursions.easy;

public class PrintNto1 {
    public static void main(String[] args) {
       printINCDEC(5);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }

    public static void printInc(int n){
        if (n== 0){
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void printINCDEC(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printINCDEC(n-1);
        System.out.println(n);
    }
}
