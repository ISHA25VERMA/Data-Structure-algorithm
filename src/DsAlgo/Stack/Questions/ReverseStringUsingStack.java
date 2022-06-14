package DsAlgo.Stack.Questions;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "ISHA IS A GOOD GIRL";
        for(int i = 0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        String revString = "";

        for (int i = str.length()-1; i>=0; i--){
            revString += stack.pop();
        }

        System.out.println(revString);
        System.out.println(5/2);
    }
}
