package DsAlgo.Stack.Questions;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(])";
        System.out.println(checkValid(str));
    }

    public static boolean checkValid(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']'){
                if (!stack.isEmpty()){
                    if (str.charAt(i) == ')'){
                        if (stack.peek() == '('){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }
                    else if (str.charAt(i) == ']'){
                        if (stack.peek() == '['){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }
                    else if (str.charAt(i) == '}'){
                        if (stack.peek() == '{'){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }
                }
                else{
                    return false;
                }
            }
        }

        if (stack.isEmpty()){
            return true;
        }

        return false;

    }
}
