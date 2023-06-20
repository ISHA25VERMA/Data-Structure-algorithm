package DsAlgo.maths;

import java.util.ArrayList;
import java.util.List;

public class firstMprimes {
    public static void main(String[] args) {

    }
    private static int getFirstMPrimes(int m){
        List<Integer> primes = new ArrayList<>();
        int[] arr = new int[m+1];
        boolean[] notPrime = new boolean[m+1];

        for(int  i = 0; i<arr.length; i++){
            arr[i] = i;
        }

        for(int i = 2; i<=m; i++){
            if(!notPrime[i] ){
                primes.add(i);
                if(primes.size()== m){

                }
                for(int j = 2*i; j<=m; j+=j){
                    notPrime[j] = true;
                }
            }
        }
        return 0;
    }
}
