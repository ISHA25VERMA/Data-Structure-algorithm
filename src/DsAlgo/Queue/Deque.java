package DsAlgo.Queue;

public class Deque {
    int[] arr;
    int front, rear, size;

    Deque(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        if (front == -1){
            return true;
        }

        return false;
    }

    public boolean isFull(){
        if ((front == 0 && rear == size-1) || ((front!= 0) && (rear == (front-1)%(size-1)))){
            return true;
        }
        return false;
    }

    public boolean pushFront(int data){
        if (isFull()){
            System.out.println("The deque is full");
            return false;
        }
        else if (front == -1){
            arr[0] = data;
            front++;
            rear++;
            return true;
        }
        else if (front == 0 ){
            arr[size-1] = data;
            front = size-1;
            return true;
        }else{
            arr[--front] = data;
            return true;
        }
    }

    public int popFront(){

        if(isEmpty()){
            System.out.println("The deque is empty");
            return -1;
        }else if (rear == front){
            int ans = arr[rear];
            rear = front = -1;
            return ans;
        }
        else if (front == size-1){
            int ans = arr[front];
            front = 0;
            return ans;
        }else {
            int ans = arr[front];
            front ++;
            return ans;
        }
    }

    public boolean pushRear(int data){
        if (isFull()){
            System.out.println("The deque is full");
            return false;
        }else if (front == -1){
            rear++;
            front++;
        }else if (rear == size-1){
            rear = 0;
        }else {
            rear++;
        }

        arr[rear] = data;
        return true;
    }

    public int popRear(){
       if (isEmpty()){
           return -1;
       }else if (rear == front){
           int ans = arr[rear];
           rear = front = -1;
           return ans;
       }
       else if (rear == 0){
           int ans = arr[rear];
           rear = size-1;
           return ans;
       }else {
           int ans = arr[rear];
           rear--;
           return ans;
       }
    }

}
