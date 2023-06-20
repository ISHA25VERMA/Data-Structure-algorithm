package DsAlgo.Trees.Questions;

import DsAlgo.Trees.Node;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static void main(String[] args) {

    }

    private static ArrayList<Integer> traverseLeft (Node root){
        ArrayList<Integer> lefts = new ArrayList<>();
        if(root==null){
            return lefts;
        }
        if(root.left == null && root.right == null){
            return lefts;
        }

        lefts.add(root.data);

        if(root.left!=null){
            lefts.addAll(traverseLeft(root.left));
        }else if(root.right!=null){
            lefts.addAll(traverseLeft(root.right));
        }

        return lefts;
    }

    private static ArrayList<Integer> traverseRoots(Node root){
        ArrayList<Integer> leaves= new ArrayList<>();
        if(root==null){
            return leaves;
        }
        if(root.left == null && root.right == null){
            leaves.add(root.data);
            return leaves;
        }

        if(root.left != null){
            leaves.addAll(traverseRoots(root.left));
        }
        if(root.right != null){
            leaves.addAll(traverseRoots(root.right));
        }

        return leaves;
    }

    private static ArrayList<Integer> traverseRight(Node root){
        ArrayList<Integer> rights = new ArrayList<>();
        if(root==null){
            return rights;
        }
        if(root.left == null && root.right == null){
            return rights;
        }

        if(root.right!= null){
            rights.addAll(traverseRight(root.right));

        }else if (root.left!=null){
            rights.addAll(traverseRight(root.left));
        }
        rights.add(root.data);
        return rights;
    }

    public static ArrayList<Integer> traverseBoundary(Node root){
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        ans.add(root.data);

        ans.addAll(traverseLeft(root.left));

        ans.addAll(traverseRoots(root.left));
        ans.addAll(traverseRoots(root.right));

        ans.addAll(traverseRight(root.right));

        return ans;
    }
}
