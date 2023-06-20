package DsAlgo.Graphs.Questions;
import java.util.*;
class SolutionBellmanFord {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Write your code here

        int[] distance = new int[V];
        for(int i = 0; i<V; i++){
            distance[i] = (int)(1e9);
        }
        distance[S] = 0;
        for(int i = 0; i<V-1; i++){
            for(ArrayList<Integer> it : edges){
                int v = it.get(0);
                int u = it.get(1);
                int wt = it.get(2);

                if (distance[v]!= 1e9 && (distance[v]+wt < distance[u])){
                    distance[u] = distance[v]+wt;
                }
            }
        }

        //running the loop nth time to check if the
        //distance array updates
        //if it updates then we have a negative cycle

        for(ArrayList<Integer> it : edges){
            int v = it.get(0);
            int u = it.get(1);
            int wt = it.get(2);

            if (distance[v]!= 1e9 && (distance[v]+wt < distance[u])){
                return new int[]{1};
            }
        }

        return distance;
    }
}

public class BellmanFordAlgorithm {
}
