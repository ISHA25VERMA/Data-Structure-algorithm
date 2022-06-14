package DsAlgo.Stack.Questions;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(0);
        stack.push(0);
        stack.push(2);
//        stack.push(1);
        Stack<Integer>  newStack = sort(stack);

        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());

    }

    private static Stack<Integer> sort(Stack<Integer> stack){
        if (stack.isEmpty()){
            return stack;
        }

        int n = stack.pop();

        sort(stack);
        addElementAtCorrectPosition(stack, n);
        return stack;
    }

    public static void addElementAtCorrectPosition(Stack<Integer> stack, int element){
        Stack<Integer> temp = new Stack<>();
        int tempVal;

        while ((!stack.isEmpty())&& stack.peek() > element ){
            tempVal  = stack.pop();
            temp.push(tempVal);
        }

        stack.push(element);
        while(!temp.isEmpty()){
            int n = temp.pop();
            stack.push(n);
        }
    }
}
