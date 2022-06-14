package DsAlgo;

public class SamsungQuestion {
    public static void main(String[] args) {
        System.out.println(SumPrimeFactors(20));
    }

    static int SumPrimeFactors(int n) {
        int sum = 0;
        for (int i = 2; i<n; i++){
            if (n%i == 0){
                boolean iPrime = false;
                for (int j = 2;j<i;j++){
                   if (i%j == 0){
                       iPrime = true;
                       break;
                   }
                }
                if(!iPrime){
                    sum+=i;
                }
            }
        }

        return sum;
    }
}
