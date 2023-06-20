package DsAlgo.Graphs.UnionFind;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair{
    int distance;
    int node;
    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}

public class PrimsAlgorithm {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.distance-y.distance);
        int length = 0;
        pq.add(new Pair(0,0));

        int[] visited = new int[adj.size()];

        visited[0] = 1;

        while (!pq.isEmpty()){
            int dist = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            if(visited[node]!= 1){
                visited[node] = 1;
                length += dist;
                for(ArrayList<Integer> adjNode : adj.get(node)){
                    int adjN = adjNode.get(0);
                    int adjD = adjNode.get(1);

                    if(visited[adjN]!= 1){
                        pq.add(new Pair(adjD, adjN));
                    }
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {

    }
}
