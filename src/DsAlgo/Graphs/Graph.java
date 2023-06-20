package DsAlgo.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    public HashMap<Integer, ArrayList<Integer>> adjacencyList ;
    public ArrayList<ArrayList<Integer>> adjacencyArray;
    Graph(){
        adjacencyList = new HashMap<>();
    }
    void addEdge( int u, int v, boolean direction){
        //true -> undirected
        //false -> directed

        if (adjacencyList.get(u) == null) {
            adjacencyList.put(u, new ArrayList<Integer>());
        }
        adjacencyList.get(u).add(v);

        if (direction){
            if (adjacencyList.get(v) == null) {
                adjacencyList.put(v, new ArrayList<Integer>());
            }
            adjacencyList.get(v).add(u);
        }
    }

    void print(){
        for(int i: adjacencyList.keySet()){
            System.out.print(i + "->");
            for (int j : adjacencyList.get(i)){
                System.out.print(j+", ");
            }
            System.out.println();
        }
    }
}
