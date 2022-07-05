package DsAlgo.Queue.Questions;
import java.util.*;

public class ReverseFirstKelementsOfQueue {
    public static void main(String[] args) {

    }
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> ans = new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i<k; i++){
            stack.push(q.remove());
        }

        for (int i = 0; i<k; i++){
            q.add(stack.pop());
        }

        for(int i = 0; i< (q.size()-k); i++){
            q.add(q.remove());
        }

        return q;
    }
}
