package DsAlgo.Graphs.Questions;
import java.util.*;

class SolutionPath {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        // code heret

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i =0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length; i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
        int[] distances = new int[n+1];
        int[] parent = new int[n+1];
        for (int i = 0; i<=n; i++){
            distances[i] = (int)(1e9);
            parent[i] = i;
        }


        pq.add(new Pair(1,0));
        distances[1] = 0;

        while(!pq.isEmpty()){
            int dist = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for(Pair it : adj.get(node)){
                int adjNode = it.node;
                int adjDist = it.distance;

                if ((dist + adjDist) < distances[adjNode]){
                    distances[adjNode] = dist+adjDist;
                    pq.add(new Pair( adjNode, distances[adjNode]));
                    parent[adjNode] = node;

                }
            }

        }

        List<Integer> path = new ArrayList<>();
        if(distances[n] == 1e9){
            path.add(-1);
            return path;
        }
        int node = n;
        while(parent[node] != node){
            path.add(node);
            node = parent[node];
        }
        path.add(1);
        Collections.reverse(path);
        return path;
    }
}
public class ShortestDistancePathInUndirectedWeightedGraph {
}
