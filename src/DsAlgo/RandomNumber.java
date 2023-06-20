package DsAlgo;

import java.util.HashMap;
import java.util.Map;

public class RandomNumber {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arrays");
        map.put(2, "Strings");
        map.put(3, "Hashing");
        map.put(4, "Searching & Sorting");
        map.put(5, "binary search");
        map.put(6, "Recursion & Backtracking");
        map.put(7, "Bit Manipulation");
        map.put(8, "Prefix sum");
        map.put(9, "Linked list");
        map.put(10, "Stacks");
        map.put(11, "Queues");
        map.put(12, "Trees");
        map.put(13, "BST");
        map.put(14, "Graphs");
        map.put(15, "Tries");
        map.put(16, "Disjoint Sets & Union Find");
        map.put(17, "Dynamic Programming");
        map.put(18, "Heaps(min heap, max heap)");

        int min = 1;
        int max = 19;

        int num = (int)(Math.random()* (max-min+1)+1);
        System.out.println(num);
        String title = map.get(num);
        System.out.println(title);
    }
}
