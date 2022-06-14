package DsAlgo.Stack.Questions;

import java.util.Stack;

public class MinimumCostForValidString {
    public static void main(String[] args) {
        String str = "{{{}}{}{{}";
        System.out.println(findMinimumCost(str));
    }
    public static int findMinimumCost(String str) {
        // Write your code here
        if (str.length()%2 == 1){
            return -1;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '{'){
                stack.push(str.charAt(i));
            }else{
                if ((!stack.isEmpty()) && stack.peek() == '{' ){
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }
            }
        }

        int a = 0, b= 0;
        while(!stack.isEmpty()){
            if (stack.peek() == '{'){
                a++;
            }else{
                b++;
            }
            stack.pop();
        }

        int ans = (a+1)/2 + (b+1)/2;

        return ans;

    }
}
