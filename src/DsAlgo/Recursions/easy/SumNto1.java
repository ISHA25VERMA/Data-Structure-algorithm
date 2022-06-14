package DsAlgo.Recursions.easy;

public class SumNto1 {
    public static void main(String[] args) {
        System.out.println(sumNto1(16));
    }
    public static int sumNto1(int n){
        if (n == 1){
            return 1;
        }

        return n + sumNto1(n-1);
    }
}
