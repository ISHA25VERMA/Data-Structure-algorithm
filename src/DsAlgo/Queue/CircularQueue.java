package DsAlgo.Queue;

import java.util.ArrayList;

public class CircularQueue {
    int[] queue;
    int rear, front, size;

    CircularQueue(int size){
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    public boolean isFull(){
        if ((front == 0 && rear == size-1) || (rear == ((front-1)%(size-1))) ){
            return true;
        }

        return false;
    }
    public boolean isEmpty(){
        if (rear== -1){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("The stack is full");
            return;
        }
        if ((rear == size-1) && (front!=0)) {
            queue[0] = data;
            rear = 0;
            return;
        }

        queue[++rear] = data;

    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("The stack is empty ");
            return -1;
        }
        if (front==rear){
            int ans = queue[front];
            front = -1;
            rear =-1;
            return ans;
        }
        if (front == size-1){
            int ans = queue[front];
            front = 0;
            return ans;
        }

        return queue[front++];
    }
}
