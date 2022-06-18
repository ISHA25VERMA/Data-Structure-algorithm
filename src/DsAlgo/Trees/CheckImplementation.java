package DsAlgo.Trees;

public class CheckImplementation {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTree.TreeNode root = tree.buildTree(1);
        System.out.println("\nLevel order traversal : ");
        tree.levelOrderTraversal(root);
        System.out.println("\nReverse Level order traversal : ");
        tree.reverseLevelOrder(root);
        System.out.println("\nPre order order traversal : ");
        tree.preorder(root);
        System.out.println("\nPost order traversal : ");
        tree.postorder(root);
        System.out.println("\nin-order traversal : ");
        tree.inorder(root);
    }
}
