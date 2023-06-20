package DsAlgo.Codeforces.Practice.SegmentTrees;

import java.util.Scanner;

public class BashAndAToughMathPuzzle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] nums = new int[n+1];
        for(int i = 0; i<=n; i++){
            nums[i] = scan.nextInt();
        }

        int[] tree = new int[4*n];

        buildSegmentTree(tree, nums, 1, n, 1);
    }

    public static void buildSegmentTree(int[] tree, int[] nums, int left, int right, int index){
        if(left == right){
            tree[index] = nums[left];
        }

        int mid = left + (right-left)/2;

        buildSegmentTree(tree, nums, left, mid, 2*index);
        buildSegmentTree(tree, nums, mid+1, right, 2*index+1);

        if(tree[2*index]>= tree[2*index+1]){
            tree[index] = gcd(tree[2*index], tree[2*index+1]);
        }else{
            tree[index] = gcd(tree[2*index+1], tree[2*index]);
        }
    }

//    private static void  update(int[] tree, int[] nums,int index, int left, int right, int updateIndex, int updateValue){
//        if(left == right){
//            tree[index] = nums[updateIndex] = updateValue;
//            return;
//        }
//
//        int mid = left + (right-left)/2;
//
//        if(updateIndex>= left && updateIndex<=mid){
//            update(tree, nums, 2*index, left, mid, updateIndex, updateValue);
//        }else{
//            update(tree, nums, 2*index+1, mid+1, right, updateIndex, updateValue);
//        }
//
//        if(tree[2*index]>= tree[2*index+1]){
//            tree[index] = gcd(tree[2*index], tree[2*index+1]);
//        }else{
//            tree[index] = gcd(tree[2*index+1], tree[2*index]);
//        }
//    }

//    private static void rangeQuery(int[] tree, int index, int left, int right, int st, int ed, int x, int[] count){
//
//        if (left == st && right == ed){
//            if(tree[index] %x != 0){
//                count[0]++;
//            }
//            return;;
//        }
//
//        if(tree[index]%x == 0){
//            return;
//        }else {
//
//        }
//    }

    private static int gcd (int a, int b){
        if(b == 0){
            return  a;
        }

        return gcd(b, a%b);

    }
}
