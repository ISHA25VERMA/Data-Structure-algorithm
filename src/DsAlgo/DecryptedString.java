package DsAlgo;

import java.util.Arrays;

public class DecryptedString {
    public static void main(String[] args) {
        System.out.println(characterAt("a1b1c3", 5));
    }

    public static String characterAt(String input1,int input2){
        StringBuilder newString = new StringBuilder();
        char myChar = '.';
        for (int i = 0; i<input1.length(); i++){
            if (input1.charAt(i)>= 97 && input1.charAt(i)<= 122){
                newString.append(input1.charAt(i));
                myChar = input1.charAt(i);
            }else{
                int num = input1.charAt(i) - '0';
                for (int j = 1; j<num; j++){
                    newString.append(myChar);
                }

            }
        }

        String ans = ""+ newString.toString().charAt(input2);
        return ans;
    }

}
