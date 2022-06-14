package DsAlgo.Recursions.easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOfN(5));
        System.out.println(factorialOfN(1));
        System.out.println(factorialOfN(0));

    }
    public static int factorialOfN(int n){
        if (n == 1 || n==2 ||n ==0 ){
            return n;
        }

        return n * factorialOfN(n-1);
    }
}
