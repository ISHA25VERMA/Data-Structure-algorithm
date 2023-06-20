package DsAlgo.Graphs.Questions;

import java.util.*;

class Stop{
    int cost;
    int node;
    int stops;

    public Stop(int cost, int node, int stops){
        this.cost = cost;
        this.node = node;
        this.stops = stops;
    }
}

class Flight{
    int cost;
    int node;

    public Flight(int node, int cost){
        this.cost = cost;
        this.node = node;
    }
}

class SolutionFlights {

    public int CheapestFLight(int n,int flights[
            ][],int src,int dst,int k) {
        // Code here
        ArrayList<ArrayList<Flight>> adj = new ArrayList<>();
        for (int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for (int i =0; i<flights.length; i++){
            adj.get(flights[i][0]).add(new Flight(flights[i][1], flights[i][2]));
        }
        int[] costs = new int[n];
        for (int i =0; i<n; i++) costs[i] = (int)(1e9);

        PriorityQueue<Stop> pq = new PriorityQueue<>((x, y)-> x.stops - y.stops);
        //can use a queue too as the stops increase by unit distance only
        // it will store the same way a queue will store like a normal bfs
        // you have to consider distances with lesser stops first
        pq.add(new Stop(0, src, 0));
        costs[src] = 0;

        while(!pq.isEmpty()){
            int cost = pq.peek().cost;
            int stops = pq.peek().stops;
            int node = pq.peek().node;

            pq.remove();

            for(Flight it : adj.get(node)){
                int adjCost = it.cost;
                int adjNode = it.node;


                if(((adjCost + cost)< costs[adjNode]) && (stops <= k) ){
                    costs[adjNode] = adjCost + cost;
                    pq.add(new Stop(costs[adjNode], adjNode, stops+1));
                }
            }
        }

        // System.out.println(Arrays.toString(costs));

        if(costs[dst] == 1e9){
            return -1;
        }

        return costs[dst];
    }
}
public class CheapestFlightsWithKStops {
}
