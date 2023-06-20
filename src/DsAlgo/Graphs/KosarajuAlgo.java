package DsAlgo.Graphs;

import java.util.ArrayList;
import java.util.Stack;

class Solution1
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // List<Integer> finishTime = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] visited = new int[V];
        for(int i = 0; i<V; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                dfs(i, visited, stack, adj);
            }
        }

        ArrayList<ArrayList<Integer>> rev = new ArrayList<>();
        for(int i = 0; i<V; i++){
            rev.add(new ArrayList<>());
        }

        //reverse the graph
        for(int i = 0; i<adj.size(); i++){
            for(int j = 0; j<adj.get(i).size(); j++){
                rev.get(adj.get(i).get(j)).add(i);
            }
        }

        //do a dfs traversal
        visited = new int[V];
        int ans = 0;

        while(!stack.isEmpty()){
            int n = stack.pop();

            if(visited[n] == 0){
                ans++;
                visited[n] = 1;
                dfs2(n, visited, rev);
            }
        }

        return ans;

        //code here
    }

    private void dfs2(int node, int[] visited, ArrayList<ArrayList<Integer>> rev){
        for(int child : rev.get(node)){
            if(visited[child] == 0){
                visited[child] = 1;
                dfs2(child, visited, rev);
            }
        }
    }

    private void dfs(int node, int[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj){

        for(int child : adj.get(node)){
            if(visited[child] == 0){
                visited[child] = 1;
                dfs(child, visited, stack, adj);
            }
        }

        stack.push(node);
    }
}

public class KosarajuAlgo {
}
