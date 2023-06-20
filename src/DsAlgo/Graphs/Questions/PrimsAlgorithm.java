package DsAlgo.Graphs.Questions;
import java.util.*;
class SolutionPrims
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        int sum =0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->x.distance-y.distance);

        int[] visited = new int[V];

        pq.add(new Pair(0,0));
        while(pq.size()!= 0){
            int wt = pq.peek().distance;
            int node = pq.peek().node;

            pq.remove();

            if(visited[node] == 1) continue;

            visited[node] = 1;
            sum += wt;

            for(int i =0; i<adj.get(node).size(); i++){
                int edge = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if(visited[adjNode] == 0){
                    pq.add(new Pair(edge, adjNode));
                }
            }

        }

        return sum;
        // Add your code here
    }
}

public class PrimsAlgorithm {
}
