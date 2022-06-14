package DsAlgo;

import java.sql.Struct;
import java.util.Scanner;

public class Zeroh {
    public static void main(String[] args) {
        String str = "hello 45";
        System.out.println(NumberEncoding(str));
    }
    public static String NumberEncoding(String str){
        String ans = new String();
        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i)>=97 && str.charAt(i)<=122){
                int add = str.charAt(i) - 'a'+1;
                ans += add;
            }else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}
