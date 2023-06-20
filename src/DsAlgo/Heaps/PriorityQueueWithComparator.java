package DsAlgo.Heaps;

import java.util.PriorityQueue;



public class PriorityQueueWithComparator {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("isha");
        pq.add("sneha");
        pq.add("sahib");
        pq.add("sheetal");

        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }
}
