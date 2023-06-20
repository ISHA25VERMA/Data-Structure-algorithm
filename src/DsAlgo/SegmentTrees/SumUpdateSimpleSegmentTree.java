package DsAlgo.SegmentTrees;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class SumUpdateSimpleSegmentTree {
    static int[] tree;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        tree = new int[4*n];

        buildSegmentTree(arr, 1, 0, n-1);
        System.out.println(Arrays.toString(tree));
        System.out.println(sum(1, 0, n-1, 1, 4));
        update(1, 0, n-1, 2, 4);
        update(1, 0, n-1, 5, 10);
        System.out.println(sum(1, 0, n-1, 2, 6));
        System.out.println(Arrays.toString(tree));
    }

    private static void buildSegmentTree(int[] arr, int index, int l, int r){
        if(l == r){
            tree[index] = arr[l];
        }else{
            int mid = l + (r-l)/2;
            buildSegmentTree(arr, 2*index, l, mid);
            buildSegmentTree(arr, 2*index+1, mid+1, r);
            tree[index] = tree[2*index]+tree[2*index+1];
        }
    }

    private static  int sum(int index, int st, int ed, int l, int r){
        if(l>r){
            return 0;
        }
        if(l == st && r == ed){
            return tree[index];
        }
        int mid = st+ (ed-st)/2;
        return sum(2*index, st, mid, l, Math.min(r, mid))
                + sum(2*index+1,mid+1, ed, Math.max(l, mid+1), r );
    }

    private static void update(int index, int st, int ed, int pos, int val){
        if(st == ed){
            tree[index] = val;
        }else{
            int mid = st+(ed-st)/2;
            if(pos<=mid){
                update(2*index, st, mid, pos, val);
            }else{
                update(2*index+1, mid+1, ed, pos, val);
            }
            tree[index] = tree[index*2]+tree[index*2+1];
        }
    }
}
