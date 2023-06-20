package DsAlgo.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] visited = new int[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.remove();
            ans.add(node);

            for(int p : adj.get(node) ){
                if(visited[p] == 0){
                    visited[p] = 1;
                    q.add(p);
                }
            }
        }
        return ans;
    }
}
public class BFSTraversal {
}
