package DsAlgo.PBLJ_LAB.theory.Assignment1;

class Calculator{
    static double powerInt(int num1, int num2){
        return Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2){
        return Math.pow(num1, num2);
    }
}
public class Ques1 {
    public static void main(String[] args) {
        System.out.println(Calculator.powerInt(2, 4));
        System.out.println(Calculator.powerDouble(3.1, 2));
    }
}
