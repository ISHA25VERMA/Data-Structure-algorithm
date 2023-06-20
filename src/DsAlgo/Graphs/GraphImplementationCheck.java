package DsAlgo.Graphs;

public class GraphImplementationCheck {
    public static void main(String[] args) {

        Graph gr = new Graph();

        gr.addEdge(0,1, true);
        gr.addEdge(0,4,true);
        gr.addEdge(1,2,true);
        gr.addEdge(1,3,true);
        gr.addEdge(1,4,true);
        gr.addEdge(2,3,true);
        gr.addEdge(3,4,true);

        gr.print();
    }
}
