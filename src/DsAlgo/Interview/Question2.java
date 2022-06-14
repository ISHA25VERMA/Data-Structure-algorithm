package DsAlgo.Interview;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        String str = "good morning";

        System.out.println("first repeating character  : "+str.charAt(firstRepeating(str)));

    }

    public static int firstRepeating(String str){
        char count[] = new char[256];

        for (int i = 0; i <str.length(); i++){
            count[str.charAt(i)]++;
        }


        int ansIndex = -1;
        for(int i = 0; i<str.length(); i++){
            if(count[str.charAt(i)]==1){
                ansIndex = i;
                break;
            }
        }

        return ansIndex;
    }
}
