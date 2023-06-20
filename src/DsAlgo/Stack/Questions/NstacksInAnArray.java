package DsAlgo.Stack.Questions;

class stacks{
    int n;
    int size;

    int free;
    int[] top;
    int[] arr;
    int[] next;
    stacks(int size, int n){
        this.n = n;
        this.size = size;

        free = 0;
        top = new int[n];
        arr = new int[size];
        next = new int[size];
        int i;
        for ( i = 0; i<top.length; i++){
            top[i] = -1;
        }

        for( i =0; i<next.length-1; i++){
            next[i] = i+1;
        }
        next[i] = -1;
    }

    public void push(int element, int stack){
        if (free!=-1){
            int index = free;
            free = next[index];

            next[index] = top[stack-1];
            top[stack-1] = index;

            arr[index] =  element;

        }else{
            System.out.println("Stack is full no more insertion can happen");
        }

    }

    public int pop(int stack){

        if (top[stack-1]!=-1){
            int index = top[stack-1];

            top[stack-1] = next[index];
            next[index] = free;

            free = index;

            int element = arr[index];
            return element;
        }else{
            System.out.println("stack is empty");
            return -1;
        }


    }
}

public class NstacksInAnArray {
}
