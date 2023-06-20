package DsAlgo.Graphs.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Answer{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
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
        int[] ans = new int[V];
        int j =0;
        while (!q.isEmpty()){
            int node = q.remove();
            ans[j++] = node;
            for(int adjacentNodes : adj.get(node)){
                indegree[adjacentNodes] --;
                if(indegree[adjacentNodes] == 0){
                    q.add(adjacentNodes);
                }
            }
        }

        return ans;
    }
}


public class TopologicalSortUsingKahns {
    public static void main(String[] args) {

    }
}
