package DsAlgo.Trees.Questions;

import DsAlgo.Trees.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ZigZagTraversal {
    public static void main(String[] args) {

    }

    ArrayList<Integer> zigZagTraversal(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }

        Deque<Node> dq = new LinkedList<>();

        dq.addLast(root);
        ans.add(root.data);

        int level = 1;

        while(!dq.isEmpty()){
            int n = dq.size();

            for (int i = 0; i<n; i++){
                if (level % 2 == 0){
                    Node temp = dq.pollLast();

                    if (temp.left != null){
                        dq.addFirst(temp.left);
                        ans.add(temp.left.data);
                    }
                    if (temp.right != null){
                        dq.addFirst(temp.right);
                        ans.add(temp.right.data);
                    }
                }else{
                    Node temp = dq.pollFirst();
                    if (temp.right != null){
                        dq.addLast(temp.right);
                        ans.add(temp.right.data);
                    }
                    if (temp.left != null){
                        dq.addLast(temp.left);
                        ans.add(temp.left.data);
                    }
                }
            }

            level += 1;
        }

        return ans;
        //Add your code here.
    }
}
