package DsAlgo.Graphs.Questions;

import java.util.*;
class Node{
    int first;
    int second;
    public Node(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class SolutionCycleDetectionDFS{
    public boolean cycleDetection(int[][]edges, int n, int m){
        int[] visited = new int[n+1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n+1; i++){
            list.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        if(edges.length <=0){
            return false;
        }

        for(int i = 1; i<n+1; i++){
            if(visited[i] == 0){
                if(dfs(i, -1, visited, list)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[node]  = 1;

        for(int adjacentNodes : adj.get(node)){
            if(visited[adjacentNodes] == 0){
                if(dfs(adjacentNodes, node, visited, adj)){
                    return true;
                }
            }else if(parent!= adjacentNodes){
                return true;
            }
        }

        return false;
    }
}
// link : https://www.codingninjas.com/codestudio/problems/cycle-detection-in-undirected-graph_1062670?topList=striver-sde-sheet-problems
class SolutionCycleDetectionBFS {

    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        //creating adjacency list for undirected
        int[] visited = new int[n+1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n+1; i++){
            list.add(new ArrayList<>());
        }
        for(int i =0; i<edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Node> q = new LinkedList<>();
        for(int i = 0 ; i<edges.length; i++){
            if(visited[edges[i][0]]== 0){
                visited[edges[i][0]]=1;
                q.add(new Node(edges[i][0], -1));
                while(!q.isEmpty()){
                    Node p = q.remove();
                    int node = p.first;
                    int parent = p.second;

                    for(int adjacentNodes : list.get(node)){
                        if(visited[adjacentNodes] == 0){
                            visited[adjacentNodes] = 1;
                            q.add(new Node(adjacentNodes, node));
                        }else if(parent != adjacentNodes){
                            return "Yes";
                        }
                    }
                }
            }
        }

        return "No";

    }

}

public class DetectCycleInUndirectedGraph {
    public static void main(String[] args) {

    }
}
