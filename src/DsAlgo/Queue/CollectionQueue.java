package DsAlgo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> queue  = new LinkedList<>();

        queue.add(2);
        queue.add(4);
        queue.add(7);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.offer(8);
        System.out.println(queue);
    }
}
