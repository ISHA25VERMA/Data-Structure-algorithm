package DsAlgo.Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class BinaryTree {
    Scanner scan = new Scanner(System.in);
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            left = right = null;
        }
    }

    public TreeNode buildTree(int nodeData){
        if (nodeData == -1){
            return null;
        }
        TreeNode root = new TreeNode(nodeData);
        System.out.print("Enter data for left of "+nodeData+" node : ");
        int left = scan.nextInt();
        root.left = buildTree(left);
        System.out.print("Enter data for right of "+nodeData+" node : ");
        int right = scan.nextInt();
        root.right = buildTree(right);

        return root;
    }

    public void levelOrderTraversal(TreeNode node){
        Queue<TreeNode> n = new LinkedList<>();
        n.add(node);
        n.add(null);

        while (!n.isEmpty()){
            TreeNode temp = n.poll();

            if (temp == null){
                System.out.println();
                if(!n.isEmpty()){
                    n.add(null);
                }
            }else{
                System.out.print(temp.data + " ");
                if (temp.left!= null){
                    n.add(temp.left);
                }

                if (temp.right!= null){
                    n.add(temp.right);
                }
            }

        }
    }

    public void reverseLevelOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        stack.push(root);
        stack.push(null);
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();

            if (temp == null){
                if(!queue.isEmpty()){
                    queue.add(null);
                    stack.push(null);
                }
            }else{
                if (temp.left!= null){
                    stack.push(temp.left);
                    queue.add(temp.left);
                }

                if (temp.right!= null){
                    stack.push(temp.right);
                    queue.add(temp.right);
                }
            }

        }

        while (!stack.isEmpty()){
            if(stack.peek() == null){
                System.out.println();
                stack.pop();
            }else{
                System.out.print(stack.peek().data);
                stack.pop();
            }
        }
    }

    public void inorder(TreeNode root){
        if (root.left!= null){
            inorder(root.left);
        }
        if (root!= null){
            System.out.print(root.data+" ");
        }
        if (root.right != null){
            inorder(root.right);
        }
    }

    public void postorder(TreeNode root){
        if (root.left!= null){
            postorder(root.left);
        }
        if (root.right != null){
            postorder(root.right);
        }
        if (root!= null){
            System.out.print(root.data+" ");
        }

    }

    public void preorder(TreeNode root){
        if (root!= null){
            System.out.print(root.data+" ");
        }
        if (root.left!= null){
            preorder(root.left);
        }
        if (root.right != null){
            preorder(root.right);
        }
    }

    int height(TreeNode node)  //height of binary tree
    {
        if (node == null){
            return 0;
        }

        return Math.max(height(node.left), height(node.right))+1;
        // code here
    }

    int diameter(TreeNode root) {
        // Your code here
        if (root == null){
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);

        int left_right = height(root.left) +height(root.right);

        int ans = Math.max(Math.max(left,right), left_right);

        return ans;
    }

    private class Pair {
        int diameter;
        int height;

        Pair(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }

        Pair() {

        }
        }

        public int diameterFast(TreeNode node) {
            return diameterFastInternal(node).diameter;
        }

        private Pair diameterFastInternal(TreeNode node) {
            if (node == null) {
                return new Pair(0, 0);
            }

            Pair left = diameterFastInternal(node.left);
            Pair right = diameterFastInternal(node.right);

            int op1 = left.diameter;
            int op2 = right.diameter;
            int op3 = left.height + right.height + 1;


            Pair ans = new Pair();
            ans.diameter = Math.max(Math.max(op1, op2), op3);
            ans.height = Math.max(left.height, right.height) + 1;

            return ans;
        }

        boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }

            boolean left = isBalanced(root.left);
            boolean right = isBalanced(root.right);

            boolean diff = (Math.abs(height(root.left) - height(root.right)) <= 1);

            if (left && right && diff) {
                return true;
            } else {
                return false;
            }
        }

        class PairIsBalanced {
            int height;
            boolean ans;

            PairIsBalanced(int height, boolean ans) {
                this.height = height;
                this.ans = ans;
            }

            PairIsBalanced() {
            }
        }

        private PairIsBalanced internalIsBalanced(TreeNode root) {
            if (root == null) {
                return new PairIsBalanced(0, true);
            }

            PairIsBalanced left = internalIsBalanced(root.left);
            PairIsBalanced right = internalIsBalanced(root.right);

            boolean ans1 = left.ans;
            boolean ans2 = right.ans;
            boolean ans3 = (Math.abs(left.height - right.height) <= 1);

            PairIsBalanced ans = new PairIsBalanced();
            ans.ans = (ans1 && ans2 && ans3);
            ans.height = Math.max(left.height, right.height) + 1;

            return ans;
        }

        public boolean isBalancedFast(TreeNode root) {
            return internalIsBalanced(root).ans;
        }

        public boolean areIdentical(TreeNode root1, TreeNode root2) {

            //base conditions
            if (root1 == null && root2 == null) {
                return true;
            } else if (root1 == null || root2 == null) {
                return false;
            }


            if (root1.data == root2.data) {
                return areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
            } else {
                return false;
            }
        }


        //Sum Tree
        private class PairIsSum {
            int sum;
            boolean ans;

            PairIsSum() {
            }

            PairIsSum(int sum, boolean ans) {
                this.sum = sum;
                this.ans = ans;
            }
        }

        PairIsSum internalIsSum(TreeNode root) {
            if (root == null) {
                return new PairIsSum(0, true);
            }

            if (root.left == null && root.right == null) {
                return new PairIsSum(root.data, true);
            }


            PairIsSum left = internalIsSum(root.left);
            PairIsSum right = internalIsSum(root.right);
            boolean main = ((left.sum + right.sum) == root.data);

            PairIsSum ans = new PairIsSum();
            ans.ans = (left.ans && right.ans && main);
            ans.sum = left.sum + right.sum + root.data;

            return ans;

        }

        boolean isSumTree(TreeNode root) {
            return internalIsSum(root).ans;
        }

        public void printTree(TreeNode node) {
            if (node == null) {
                return;
            }
            System.out.println(node.data);
            if (node.left != null) {
                printTree(node.left);
            }

            if (node.right != null) {
                printTree(node.right);
            }

        }

}