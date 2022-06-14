package DsAlgo.Stack.Questions;

import java.util.Stack;

public class DeleteMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(83);
        stack.push(74);
        stack.push(67);
        stack.push(49);
        stack.push(94);
        stack.push(8);
        stack.push(11);
        stack.push(1);

        deleteMiddle(stack, 8);
        for(int i = 0; i<8-1; i++){
            System.out.println(stack.pop());
        }
    }

    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
        // WRITE YOUR CODE HERE
        if (N == 0 ){
            return;
        }

        if(N==1){
            inputStack.pop();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<(N/2);i++){
            int n = inputStack.pop();
            stack.push(n);
        }
        inputStack.pop();
        while(!stack.isEmpty()){
            int n = stack.pop();
            inputStack.push(n);
        }
    }

    //using recursion
    private static void solve(Stack<Integer> inputStack, int count, int N){
        if (count == N/2){
            inputStack.pop();
            return;
        }

        int n = inputStack.peek();
        inputStack.pop();

        solve(inputStack, count+1, N);

        inputStack.push(n);

    }
}
