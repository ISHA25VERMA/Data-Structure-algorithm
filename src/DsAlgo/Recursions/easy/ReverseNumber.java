package DsAlgo.Recursions.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse(int n ){
        int digits = (int) (Math.log10(n))+1;
        int power = digits-1;
//        int digits = countDigits(n)-1;
        if (n<1){
            return 0;
        }
        int rem = n%10;
        return (int) ((rem*Math.pow(10,power)) + reverse(n/10));
    }
    public static int countDigits(int n){
        if (n == 0){
            return 0;
        }
        return 1+ countDigits(n/10);
    }
}
