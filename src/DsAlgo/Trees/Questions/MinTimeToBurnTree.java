package DsAlgo.Trees.Questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;



public class MinTimeToBurnTree {
}
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
class Solution
{
    public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start)
    {
        Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer> > map = new HashMap<>();
        BinaryTreeNode<Integer> startNode = mapToParent(root,map, start);
        int time = findTime(map, startNode);
        return time;
        // Write your code here.
    }

    private static int findTime( Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer> >map, BinaryTreeNode<Integer> start){
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        Map<BinaryTreeNode<Integer>, Integer> visited = new HashMap<>();

        visited.put(start, 1);
        q.offer(start);
        int time = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int burnt = 0;
            for(int i =0; i<size; i++){

                BinaryTreeNode<Integer> temp = q.poll();
                if(temp.left!= null && visited.get(temp.left) == null){
                    burnt = 1;
                    visited.put(temp.left, 1);
                    q.offer(temp.left);
                }
                if(temp.right!= null && visited.get(temp.right)== null){
                    burnt = 1;
                    visited.put(temp.right, 1);
                    q.offer(temp.right);
                }
                if(map.get(temp)!= null && visited.get(map.get(temp))== null){
                    burnt = 1;
                    visited.put(map.get(temp), 1);
                    q.offer(map.get(temp));
                }
            }
            if(burnt == 1){
                time+= 1;
            }
        }

        return time;
    }

    private static BinaryTreeNode<Integer> mapToParent(BinaryTreeNode <Integer> root, Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> map, int start){

        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
        BinaryTreeNode res = new BinaryTreeNode(-1);

        while(!q.isEmpty()){
            BinaryTreeNode<Integer> temp = q.remove();
            if(temp.data == start) res = temp;
            if(temp.left!= null){
                map.put(temp.left, temp);
                q.offer(temp.left);
            }
            if(temp.right!=null){
                map.put(temp.right, temp);
                q.offer(temp.right);
            }
        }

        return res;
    }
}
