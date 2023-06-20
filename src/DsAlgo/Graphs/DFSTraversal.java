package DsAlgo.Graphs;

import java.util.ArrayList;

class DFS{
    private ArrayList<Integer> dfs(int node, int V, int[] visited, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(node);
        visited[node] = 1;
        for(int i : adj.get(node)){
            if(visited[i] == 0){
                ans.addAll(dfs(i, V, visited, adj));
            }
        }

        return ans;
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] visited = new int[V];
        int start  = 0;
        visited[0] = 1;
        return dfs(start, V, visited, adj);

    }
}
public class DFSTraversal {
}
