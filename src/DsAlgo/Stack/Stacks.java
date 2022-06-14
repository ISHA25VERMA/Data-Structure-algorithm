package DsAlgo.Stack;

public class Stacks {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(24);
        stack.push(34);
        stack.push(12);
        stack.push(3);
        stack.PrintStack();
        stack.pop();
        stack.push(99);
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
