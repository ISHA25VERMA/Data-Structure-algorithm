package DsAlgo.Stack.Questions;

import java.util.Stack;

public class ValidParenthesisMedium {
    public static void main(String[] args) {
        String str = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(str.length());
        System.out.println(checkValidString(str));
    }

    public static boolean checkValidString(String str) {
        int count = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else if (str.charAt(i) == '*'){
                count++;
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    if (count >0){
                        count--;
                    }else{
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()){
            return true;
        }else if (count >= stack.size()){
            return true;
        }

        return false;


    }
}
