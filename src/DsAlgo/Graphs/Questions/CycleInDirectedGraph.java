package DsAlgo.Graphs.Questions;
import java.util.*;


class solutionUsingTopologicalSort{
    public boolean isCyclicTopoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] indegree = new int[V];

        for (int i = 0;i<adj.size(); i++){
            for(int n : adj.get(i)){
                indegree[n]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        int j =0;
        while (!q.isEmpty()){
            int node = q.remove();
            count++;
            for(int adjacentNodes : adj.get(node)){
                indegree[adjacentNodes] --;
                if(indegree[adjacentNodes] == 0){
                    q.add(adjacentNodes);
                }
            }
        }

        if (count == V){
            return false;
        }else {
            return true;
        }
    }
}

class SolutionCyclicInDirected {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here

        int[] visited = new int[V];
        int[] pathVisited = new int[V];

        for(int i = 0; i<V; i++){
            if(visited[i] == 0){
                if(dfs(i,V, visited,pathVisited, adj)){
                    return true;
                }
            }
        }

        return false;

    }

    private boolean dfs(int node, int V, int[] visited,int[] pathVisited, ArrayList<ArrayList<Integer>> adj){

        visited[node] = 1;
        pathVisited[node] = 1;

        for(int adjacentNode : adj.get(node)){
            if(visited[adjacentNode] == 0){

                if(dfs(adjacentNode, V, visited, pathVisited, adj)){
                    return true;
                }

            }else if(pathVisited[adjacentNode] ==1){
                return true;
            }
        }

        pathVisited[node] = 0;
        return false;
    }
}
public class CycleInDirectedGraph {
}
