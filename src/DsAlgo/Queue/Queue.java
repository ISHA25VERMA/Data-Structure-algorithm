package DsAlgo.Queue;

import java.util.ArrayList;

public class Queue { //implementation using array

    private int[] queue;
    private int rear, front, size;

    Queue(int size){
        this.size = size;
        queue = new int[size];
        rear = 0;
        front = 0;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Queue is full cannot push");
            return;
        }
        queue[rear++] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("the queue is empty cannot pop");
            return -1;
        }
        int ans = queue[front];
        if (front == rear){
            front = 0;
            rear = 0;
        }else{
            front += 1;
        }

        return ans;
    }

    public boolean isFull(){
        if (rear == size){
            return true;
        }

        return false;

    }

    public boolean isEmpty(){
        if (rear == front){
            return true;
        }
        return false;
    }
    public void printQueue(){
        for (int i = front; i<rear; i++){
            System.out.print(queue[i]+"->");
        }
        System.out.println("end");
    }
}
