package DsAlgo.Recursions.easy;

//find nth fibonacci number

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(printFibonacci(6));
    }

    public static int printFibonacci(int n ){
        if(n==1 || n==0){
            return n;
        }

        return printFibonacci(n-1)+printFibonacci(n-2);
    }
}
