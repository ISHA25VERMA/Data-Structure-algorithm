package DsAlgo.Stack.Questions;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        String str = "(a+c*b)+(c))";
        System.out.println(findRedundantBrackets(str));
    }
    public static boolean findRedundantBrackets(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '+' || s.charAt(i) == '-' ||s.charAt(i) == '*' || s.charAt(i) == '/'){
                if (!stack.isEmpty()){
                    if (stack.peek()=='(' ) {
                        stack.push(s.charAt(i));
                    }
                }

            }
            else if(s.charAt(i) == ')'){
                if (!stack.isEmpty()){
                    if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/'){
                        stack.pop();
                        stack.pop();
                    }else{
                        return true;
                    }
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
