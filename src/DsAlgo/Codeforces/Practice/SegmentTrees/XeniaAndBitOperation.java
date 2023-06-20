package DsAlgo.Codeforces.Practice.SegmentTrees;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XeniaAndBitOperation {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int elements = 1<<n;
        int[] arr = new int[elements+1];
        for(int i = 1; i<=elements; i++){
            arr[i] = scan.nextInt();
         }
//        System.out.println(Arrays.toString(arr));
        int[] tree = new int[ 4*((1<<n)+4) ];

        boolean or = n%2 == 0 ? false : true;
        buildSegmentTree(tree, arr, 1, 1, elements, or);
//        System.out.println(Arrays.toString(tree));
        while (m-- != 0){
            int updateIndex = scan.nextInt();
            int updateValue = scan.nextInt();
//            or = elements%2 == 0 ? false : true;
            updateQuery(tree, arr, 1, 1, elements, updateIndex, updateValue, or);
//            System.out.println(Arrays.toString(tree));

            System.out.println(tree[1]);
        }
    }

    private static void buildSegmentTree(int[] tree, int[] arr, int index, int left, int right, boolean or ){
        if(left == right){
            tree[index] = arr[left];
        }else{
            int mid = left + (right-left)/2;
            buildSegmentTree(tree, arr, 2*index, left, mid, !or);
            buildSegmentTree(tree, arr, 2*index+1, mid+1, right, !or);

            if(or){
                tree[index] = tree[2*index] | tree[2*index+1];
            }else {
                tree[index] = tree[2*index] ^ tree[2*index+1];
            }
//            System.out.println(or+"index : "+ index +" "+ tree[index]);
        }
    }

    private static void updateQuery(int[] tree,int[]arr, int currentNode, int left, int right, int updateIndex, int value, boolean or){

        if(left == right ){
            tree[currentNode] =  arr[updateIndex] = value;
            return;
        }

        int mid = left + (right-left)/2;

        if(updateIndex>= left && updateIndex<=mid){
            updateQuery(tree, arr, 2*currentNode, left, mid, updateIndex, value, !or);
        }else if(updateIndex>mid && updateIndex<=right){
            updateQuery(tree, arr, 2*currentNode+1, mid+1, right, updateIndex, value, !or);
        }

        if(or){
            tree[currentNode] = tree[2*currentNode] | tree[2*currentNode+1];
        }else {
            tree[currentNode] = tree[2*currentNode] ^ tree[2*currentNode+1];
        }
    }
}
