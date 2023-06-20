package DsAlgo.Graphs.Questions;
import java.util.*;

class SolutionBipartite
{


    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {

        int[] visited = new int[V];
        for(int i = 0;i<V; i++){
            if(visited[i] == 0){
                if(bfs(i, V,visited, adj) == false){
                    return false;
                }
            }
        }

        return true;

        // Code here
    }

    public boolean bfs(int start, int V, int[] visited, ArrayList<ArrayList<Integer>> adj){


        Queue<Integer> q = new LinkedList<>();
        visited[start] = 1;
        q.add(start);

        while(!q.isEmpty()){
            int n = q.remove();
            for(int adjacentNode : adj.get(n)){
                if(visited[adjacentNode] == 0){
                    visited[adjacentNode] = 3-visited[n];
                    q.add(adjacentNode);
                }else if(visited[n] == visited[adjacentNode]){
                    return false;
                }
            }
        }

        return true;
    }

}

public class BipartiteGraphs {
    public static void main(String[] args) {

    }
}
