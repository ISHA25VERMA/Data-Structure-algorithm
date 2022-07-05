package DsAlgo.Trees.BinarySearchTrees;

import DsAlgo.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeImplementation {
    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public Node root = null;

    public Node insertInBST(Node root, int data){
        if (root == null){
            root = new Node(data);
            return root;
        }
        if (data< root.data){
            root.left = insertInBST(root.left, data);
        }else{
            root.right = insertInBST(root.right, data);
        }

        return root;
    }

    public Node constructTree(int[] arr){

        for (int i = 0; i<arr.length; i++){
            root = insertInBST(root, arr[i]);
        }

        return root;
    }
    int min(){
        return minValue(root);
    }

    private int minValue(Node root){
        Node temp = root;
        while (temp.left!= null){
            temp = temp.left;
        }
        return temp.data;
    }

    int max(){
        return maxValue(root);
    }
    private int maxValue(Node root){
        Node temp = root;
        while (temp.right!= null){
            temp = temp.right;
        }
        return temp.data;
    }

    public void delete(int value){
        deleteNode(root, value);
    }

    public Node deleteNode(Node root, int value){
        if (root == null){
            return null;
        }

        if (root.data == value){
            if (root.left == null && root.right == null){
                root = null;
                return null;
            }
            else if (root.left != null && root.right == null){
                Node temp = root.left;
                root = null;
                return temp;
            }
            else if(root.left == null && root.right != null){
                Node temp = root.right;
                root = null;
                return temp;
            }
            else{
                int minimum = minValue(root.right);
                root.data = minimum;
                root.right = deleteNode(root.right, minimum);
                return root;
            }
        }else if (value<root.data){
            root.left =  deleteNode(root.left, value);
            return root;
        }else{
            root.right = deleteNode(root.right, value);
            return root;
        }
    }


    public void levelOrderTraversal(){
        Queue<Node> n = new LinkedList<>();
        n.offer(root);
        n.add(null);

        while (!n.isEmpty()){
            Node temp = n.poll();

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
}
