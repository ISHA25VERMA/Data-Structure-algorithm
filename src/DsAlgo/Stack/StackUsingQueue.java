package DsAlgo.Stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public MyStack() {

    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q2;
        int num = q1.remove();
        q2 = q1;
        q1 = temp;

        return num;
    }

    public int top() {
        if(q1.isEmpty()){
            return -1;
        }

        while(q1.size()!=1){
            q2.offer(q1.remove());
        }
        int ans = q1.remove();
        q2.add(ans);

        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return ans;

    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
public class StackUsingQueue {
}
