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
        n.offer(node);
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
                    n.offer(temp.left);
                }

                if (temp.right!= null){
                    n.offer(temp.right);
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

//    public void printTree(TreeNode node){
//        if (node == null){
//            return;
//        }
//        System.out.println(node.data);
//        if (node.left!= null){
//            printTree(node.left);
//        }
//
//        if (node.right!=null){
//            printTree(node.right);
//        }
//
//    }
}
