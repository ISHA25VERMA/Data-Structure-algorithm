package DsAlgo.Stack.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaxRectangleInBinaryArray {

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 0,}, {1, 1, 1,1 },{1,1,1,1},{1,1,0,0}};

        System.out.println(maxArea(arr,4,4));
    }


    static public int maxArea(int M[][], int n, int m) {
        // add code here.
        ArrayList<Integer> arr  = new ArrayList<>();
        for (int i = 0; i<m; i++){
            arr.add(M[0][i]);
        }
        System.out.println(arr);
        int maxArea = largestRectangle(arr);

        for (int i = 1; i<n; i++){
            for(int j = 0; j<m; j++ ){
                if (M[i][j] == 0){
                    arr.remove(j);
                    arr.add(j, 0);
                }else{
                    int s = (arr.get(j))+(M[i][j]);
                    arr.remove(j);
                    arr.add(j, s);
                }
            }
            System.out.println(arr);
            int newMaxArea = largestRectangle(arr);
            maxArea = Math.max(newMaxArea, maxArea);
        }

        return maxArea;
    }

    public static int largestRectangle(ArrayList < Integer > heights) {
        // Write your code here.
        ArrayList<Integer> n = nextRightSmallerElementIndex(heights, heights.size());
        ArrayList<Integer> p = nextLeftSmallerElementIndex(heights, heights.size());

        //area calculation
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i<heights.size(); i++){
            int width = n.get(i) - p.get(i) - 1;
            int area = heights.get(i) * width;
            if (area> maxArea){
                maxArea = area;
            }
        }

        return maxArea;
    }

    static ArrayList<Integer> nextRightSmallerElementIndex(ArrayList<Integer> arr, int n){


        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = n-1; i>=0; i-- ){
            int element = arr.get(i);
            while(stack.peek() !=-1 && arr.get(stack.peek()) >= element){
                stack.pop();
            }
            ans.add(stack.peek());
            stack.push(i);
        }



        Collections.reverse(ans);
        for (int i = 0; i<ans.size(); i++){
            if (ans.get(i) == -1){
                ans.remove(i);
                ans.add(i, arr.size());
            }
        }
        return ans;
    }

    static ArrayList<Integer> nextLeftSmallerElementIndex(ArrayList<Integer> arr, int n){


        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = 0; i<arr.size(); i++ ){
            int element = arr.get(i);
            while(stack.peek() !=-1 && arr.get(stack.peek()) >= element){
                stack.pop();
            }
            ans.add(stack.peek());
            stack.push(i);
        }

        return ans;
    }
}
