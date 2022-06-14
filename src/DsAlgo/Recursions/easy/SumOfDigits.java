package DsAlgo.Recursions.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(4523));
    }
    public static int sumOfDigits(int n){
        if (n<=0){
            return 0;
        }

        int rem = n%10;
        return rem + sumOfDigits(n/10);
    }
}
