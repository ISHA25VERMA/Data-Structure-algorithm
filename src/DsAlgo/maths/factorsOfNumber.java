package DsAlgo.maths;

public class factorsOfNumber {
    public static void main(String[] args) {
        printFactors(36);
    }
    public static void printFactors(int n){
        for (int i = 1; i*i <= n ; i++){
            if(n%i == 0){
                if (n/i == i){
                    System.out.println(i);
                }else {
                    System.out.println(i +" "+ n/i);
                }
            }
        }
    }
}
