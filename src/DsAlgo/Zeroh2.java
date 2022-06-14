package DsAlgo;

import java.util.Scanner;

public class Zeroh2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(TimeConvert(45));
    }
    public static int TimeConvert(int num){

        int hours = num/60;
        int minutes = num%60;
        System.out.println(hours+":"+minutes);
        return num;
    }
}
