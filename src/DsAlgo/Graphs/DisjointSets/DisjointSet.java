package DsAlgo.Graphs.DisjointSets;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> sizeA = new ArrayList<>();
    public DisjointSet(int n){
        for (int i =0; i<=n; i++){
            rank.add(0);
            sizeA.add(1);
            parent.add(i);
        }
    }

    public int findParent(int node){
        if (node == parent.get(node)){
            return node;
        }
        int ultimate_parent = findParent(parent.get(node));
        parent.set(node, ultimate_parent);
        return ultimate_parent;
    }

    public void unionByRank(int u, int v){
        int pu = findParent(u);
        int pv = findParent(v);
        if (pu == pv){
            return;
        }
        if (rank.get(pu)<rank.get(pv)){
            parent.set(pv, pu);
        }else if (rank.get(pu)>rank.get(pv)){
            parent.set(pu, pv);
        }else{
            parent.set(pu, pv);
            int rank_u = rank.get(pu);
            rank.set(pu, rank_u+1);
        }
    }

    public void unionBySize(int u, int v){
        int pu = findParent(u);
        int pv = findParent(v);
        if (pu == pv){
            return;
        }
        if (sizeA.get(pu)<sizeA.get(pv)){
            parent.set(pv, pu);
            sizeA.set(pv, sizeA.get(pv)+sizeA.get(pu));
        }else {
            parent.set(pu, pv);
            sizeA.set(pu, sizeA.get(pu)+sizeA.get(pv));
        }
    }
}
