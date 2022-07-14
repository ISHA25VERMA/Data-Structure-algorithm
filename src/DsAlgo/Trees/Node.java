package DsAlgo.Trees;

import java.util.Scanner;

public class Node {
    public int data;
    public Node left, right;
    Node(int data){
        left = right = null;
    }


}

class build{
    Scanner scan = new Scanner(System.in);
    public Node buildTree(int nodeData){
        if (nodeData == -1){
            return null;
        }
        Node root = new Node(nodeData);
        System.out.print("Enter data for left of "+nodeData+" node : ");
        int left = scan.nextInt();
        root.left = buildTree(left);
        System.out.print("Enter data for right of "+nodeData+" node : ");
        int right = scan.nextInt();
        root.right = buildTree(right);

        return root;
    }
}





