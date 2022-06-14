package DsAlgo.Recursions.easy;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(900273010));
    }
    public static int countZeroes(long n ){
        if (n <= 0){
            return 0;
        }

        long rem = n%10;
        if (rem == 0){
            return 1 + countZeroes(n/10);
        }else {
            return countZeroes(n/10);
        }
    }
}
