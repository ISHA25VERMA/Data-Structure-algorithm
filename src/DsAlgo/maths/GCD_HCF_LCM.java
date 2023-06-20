package DsAlgo.maths;

public class GCD_HCF_LCM {
    public static void main(String[] args) {
        System.out.println(hcf(4,9));
        System.out.println("lcm : "+ lcm(3,7));
    }
    public static int hcf(int a, int b ){
        if(a==0){
            return b;
        }
        return hcf((b%a), a);  // euclid's algorithm gcd(a,b) = gcd(rem(b,a),a) = gcd (rem(a,rem(b,a),a) and so on
    }

    public static int lcm(int a, int b){
        return a*b/(hcf(a,b));
    }
}
