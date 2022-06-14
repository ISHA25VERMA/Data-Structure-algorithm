package DsAlgo.maths;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        System.out.println((double) squareRoot(2147395599,3));
    }

    public static double squareRoot(int n , int decimal){
        int st = 0;
        int ed = n;
        int ans = 0;
        while (st<=ed){
            int mid = st + (ed-st)/2;
            if (mid*mid == n){
                return mid;
            }else if(mid *mid < n){
                ans = mid;
                st = mid +1;
            }else {
                ed = mid -1;
            }
        }

//        //till decimal places (decimal)
//        double i = 0.1;
//        for(int j = 0; j<decimal; j++){
//            while ((ans+i)*(ans+i)<n){
//                ans = ans +i;
//            }
//            i /= 10;
//        }

        return ans;
    }
}
