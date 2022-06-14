package DsAlgo.Stack;

public class CustomStack {
    protected int[] data;

    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int value){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = value;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Stack is empty, cannot pop");
        }

        return data[--ptr];
    }

    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Stack is empty, cannot find peek");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1; //ptr is at last index
    }
    private boolean isEmpty(){
        return  ptr == -1;
    }
}
