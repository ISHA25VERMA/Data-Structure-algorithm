package DsAlgo.Stack.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EqualStacks {
    public static void main(String[] args) {
        ArrayList<Integer> h1 = new ArrayList<>();
//        h1.add(3)''

    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int element = 0;
        for (int i =h1.size()-1; i >=0; i--){
            element += h1.get(i);
            stack1.push(element);
        }
        element = 0;
        for (int i =h2.size()-1; i >=0; i--){
            element += h2.get(i);
            stack2.push(element);
        }
        element = 0;
        for (int i =h3.size()-1; i >=0; i--){
            element += h3.get(i);
            stack3.push(element);
        }

        while(true){
            if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()){
                return 0;
            }
            if ((stack1.peek() == stack2.peek() )&& (stack1.peek() ==stack3.peek())){
                return stack1.peek();
            }

            if ((stack1.peek()>= stack2.peek()) && (stack1.peek()>=stack3.peek())){
                stack1.pop();
            }else if ((stack2.peek()>=stack1.peek()) && (stack2.peek()>=stack3.peek())){
                stack2.pop();
            }else if ((stack3.peek() >= stack2.peek()) && (stack3.peek()>= stack1.peek())){
                stack3.pop();
            }
        }
    }
}
