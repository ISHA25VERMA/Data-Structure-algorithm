package DsAlgo.Graphs.Questions;
import java.util.*;
class SolutionSafeNodes {

    private boolean dfs(int node, int V, int[] visited,int[] pathVisited, List<List<Integer>> adj, int[] checked){

        visited[node] = 1;
        pathVisited[node] = 1;
        checked[node] = 0;

        for(int adjacentNode : adj.get(node)){
            if(visited[adjacentNode] == 0){
                if(dfs(adjacentNode, V, visited, pathVisited, adj, checked)){
                    return true;
                }
            }else if(pathVisited[adjacentNode] ==1){
                return true;
            }
        }

        checked[node] = 1;
        pathVisited[node] = 0;
        return false;
    }

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        int[] visited = new int[V];
        int[] pathVisited = new int[V];
        int[] checked = new int[V];
        for(int i = 0; i<V; i++){
            if(visited[i] == 0){
                dfs(i, V, visited, pathVisited, adj, checked);
            }
        }
        List<Integer> ans= new ArrayList<>();
        for(int i =0; i<checked.length; i++){
            if(checked[i] == 1){
                ans.add(i);
            }
        }

        return ans;
        // Your code here
    }
}

public class EventualSafeNodes {
}
