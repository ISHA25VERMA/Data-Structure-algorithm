package DsAlgo.Trees;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class BinaryTreeFromInorderPreorder {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = buildTree(preorder, inorder);
    }


    static int preorderIndex;
    static Map<Integer, Integer> inorderIndexMap;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i<inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }

        return solve(preorder, 0, inorder.length-1);
    }
    private static TreeNode solve(int[] preorder, int st, int ed){
        if (st>ed){
            return null;
        }

        int value = preorder[preorderIndex++];
        TreeNode root = new TreeNode(value);

        root.left = solve(preorder, st, inorderIndexMap.get(value)-1);
        root.right = solve(preorder, inorderIndexMap.get(value)+1, ed);
        return root;
    }
}
