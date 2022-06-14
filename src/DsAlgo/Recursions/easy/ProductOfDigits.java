package DsAlgo.Recursions.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(123));
        System.out.println(productOfDigits(236));
        System.out.println(productOfDigits(505));
    }
    public static int productOfDigits(int n){
        if (n<=1){
            return 1;
        }

//        if(n%10 == n){
//            return n;
//        }

        int rem = n%10;
        return rem * productOfDigits(n/10);
    }
}
