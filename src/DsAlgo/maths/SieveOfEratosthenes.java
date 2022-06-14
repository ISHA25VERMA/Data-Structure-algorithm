package DsAlgo.maths;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        seive(n);

    }
    public static  void seive(int n){
        boolean []primes = new boolean[n+1];

        for (int i = 2; i*i<=n; i++){
            if(!primes[i]){   // false means not marked
                for (int j = 2*i ; j<=n ;  j += i){
                    primes[j] = true;      //true means not prime
                }
            }
        }

        for (int i = 2; i<=n ; i++){
            if(!primes[i]){
                System.out.println(i);
            }
        }
    }
}
