package DsAlgo.BitManipulation;

public class ithBitOfNumber {
    public static void main(String[] args) {
        int n = 48;
        int i = 6;

        System.out.println(ithBit(n,i));
    }

    public static int ithBit(int n, int i){
//        int i1 = n & (int) (Math.pow(2, i - 1));
        int i1 = n & (1<<(i-1));     // mask = 1<<(i-1) => 1<<4 = 1000
        if(i1 == 0){
            return 0;
        }
        return 1;
    }
}
