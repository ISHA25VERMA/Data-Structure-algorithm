package DsAlgo.Trees;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderPostorder {
    public static void main(String[] args) {

    }
    int postorderIndex;
    Map<Integer, Integer> inorderIndexMap;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderIndexMap=  new HashMap<>();
        for (int i = 0; i<inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }

        postorderIndex = postorder.length-1;

        return solve(postorder, 0, inorder.length-1);
    }

    private TreeNode solve(int[] postorder, int st, int ed){

        if (st>ed){
            return null;
        }

        int element = postorder[postorderIndex];
        TreeNode root = new TreeNode(element);

        postorderIndex --;

        root.right = solve(postorder, inorderIndexMap.get(element)+1, ed);
        root.left = solve(postorder, st, inorderIndexMap.get(element)-1);


        return root;
    }
}
