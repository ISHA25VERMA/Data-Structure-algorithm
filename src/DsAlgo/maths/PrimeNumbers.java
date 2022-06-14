package DsAlgo.maths;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(checkPrime(n));
    }

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        if (n<=1){
            return false;
        }
        int i = 2;
        while (i*i <= n){
            if(n%i == 0){
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}
