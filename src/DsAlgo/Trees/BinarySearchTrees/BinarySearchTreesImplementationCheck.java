package DsAlgo.Trees.BinarySearchTrees;

public class BinarySearchTreesImplementationCheck {
    public static void main(String[] args) {
        int[] arr = {10,8,21,7,27,5,4,3};

        BinarySearchTreeImplementation binarySearchTreeImplementation = new BinarySearchTreeImplementation();

        binarySearchTreeImplementation.constructTree(arr);
        binarySearchTreeImplementation.levelOrderTraversal();
        binarySearchTreeImplementation.delete(27);
        System.out.println("After deletion :");
        binarySearchTreeImplementation.levelOrderTraversal();
    }
}
