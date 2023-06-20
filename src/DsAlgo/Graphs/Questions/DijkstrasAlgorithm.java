package DsAlgo.Graphs.Questions;
import java.util.*;

class Pair{
    int distance;
    int node;
    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}

public class DijkstrasAlgorithm {
    static int[] dijkstra(int V, int[][][] adj, int S)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
        int[] distances = new int[V];
        for(int i = 0; i<V; i++) distances[i] = (int)(1e9);

        pq.add(new Pair(0, S));
        distances[S] = 0;

        while(!pq.isEmpty()){

            int distance = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for(int i = 0; i<adj[node].length; i++){
                int adjNode = adj[node][i][0];
                int adjWeight  = adj[node][i][1];

                if(distance +adjWeight < distances[adjNode]){
                    distances[adjNode] = distance+adjWeight;
                    pq.add(new Pair(distances[adjNode], adjNode));
                }
            }

        }

        return distances;
    }

    public static void main(String[] args) {
        int V = 3;
        int[][][] adj = {{{1, 1}, {2, 6}}, {{2, 3}, {0, 1}}, {{1, 3}, {0, 6}}};
        int S = 2;

        System.out.println(Arrays.toString(dijkstra(V, adj, S) ));
    }
}
