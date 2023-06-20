package DsAlgo.Stack.Questions;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }
    public static int calculate(String s) {
        int ans = 0;
        int sign = 1;
        Stack<Character> stack = new Stack<>();
        for (int i =0; i<s.length(); i++){
            while(!stack.isEmpty() && stack.peek()== '('){
                stack.pop();
            }
            char ch = s.charAt(i);
            if (ch == ' ')continue;
            if (Character.isDigit(ch)){
                int num = 0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                if (sign == -1){
                    num = -num;
                    sign = 1;
                }
                if (!stack.isEmpty()){
                    if (stack.peek() == '+'){
                        ans = ans + num;

                    }else if(stack.peek()== '-'){
                        ans = ans - num;
                    }
                }else{
                    ans = num;

                }
            }
            if (ch == '+'){
                stack.push(ch);
            }
            if (ch == '-'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    sign = -1;
                    stack.pop();
                }else{
                    stack.push('-');
                }
            }
            if (ch == '('){
                stack.push('(');
            }

        }

        return ans;
    }
}
