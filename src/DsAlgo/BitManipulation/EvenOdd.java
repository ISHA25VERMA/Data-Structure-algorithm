package DsAlgo.BitManipulation;

public class EvenOdd {
    public static void main(String[] args) {
        if (isEven(3)){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    public static Boolean isEven(int n){
        return (n&1) != 1;
    }
}
