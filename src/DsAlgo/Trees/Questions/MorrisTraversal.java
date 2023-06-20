package DsAlgo.Trees.Questions;

import java.util.ArrayList;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data = data;
    }
}
public class MorrisTraversal {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null){
            if(curr.left== null){
                inorder.add(root.data);
                curr = curr.right;
            }else{
                TreeNode prev = curr.left;
                while (prev.right!= null && prev.right!= curr){
                    prev = prev.right;
                }
                if(prev.right== null){
                    prev.right = curr;
                    curr = curr.left;
                }
                else {  //prev.right == curr
                    prev.right = null;
                    inorder.add(curr.data);
                    curr = curr.right;
                }
            }
        }

        return inorder;
    }
    public static ArrayList<Integer> preorder(TreeNode root){
        ArrayList<Integer> preorder = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null){
            if(curr.left== null){
                preorder.add(root.data);
                curr = curr.right;
            }else{
                TreeNode prev = curr.left;
                while (prev.right!= null && prev.right!= curr){
                    prev = prev.right;
                }
                if(prev.right== null){
                    prev.right = curr;
                    preorder.add(curr.data);
                    curr = curr.left;
                }
                else {  //prev.right == curr
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }

        return preorder;
    }
}
