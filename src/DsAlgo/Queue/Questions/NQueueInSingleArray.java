package DsAlgo.Queue.Questions;

import java.util.Arrays;

class KQueue{
    int k;
    int n;
    int freeSpot;
    int[] arr;
    int[] next;
    int[] front;
    int[] rear;

    KQueue(int k, int n){
        this.k = k;
        this.n = n;
        int freeSpot = 0;

        arr = new int[n];
        front = new int[k];
        rear = new int[k];

        for(int i = 0; i<k; i++){
            front[i] = -1;
            rear[i] = -1;
        }

        next = new int[n];

        for (int i = 0; i<n; i++){
            next[i] = i+1;
        }

        next[n-1] = -1;

    }

    public void push(int x, int q){
        if (freeSpot == -1){
            System.out.println("The Queue is full");
            return;
        }
        int index = freeSpot;
        freeSpot = next[index];
        if (front[q-1] == -1){
            front[q-1] = index;
        }else{
            next[rear[q-1]] = index;
        }
        rear[q-1] = index;
        next[index] = -1;
        arr[index] = x;
    }

    public int pop(int q){
        if (front[q-1] == -1){
            System.out.println("The queue is empty");
            return -1;
        }
        //take index
        int index = front[q-1];
        //increase front
        front[q-1] = next[index];
        //manage free spot
        next[index] = freeSpot;
        freeSpot = index;

        return arr[index];

    }

    public void printQueue(){
        System.out.println(Arrays.toString(arr));
    }
}

public class NQueueInSingleArray {
    public static void main(String[] args) {
        KQueue q = new KQueue(3, 10);
        q.push(10, 1);
        q.push(15, 1);
        q.push(20, 2);
        q.push(25,1);
        q.pop(2);
        q.push(8,2);

        q.printQueue();
    }

}
