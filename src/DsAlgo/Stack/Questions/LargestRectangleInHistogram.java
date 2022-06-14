package DsAlgo.Stack.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(2);
        arr.add(2);

        System.out.println(largestRectangle(arr));
    }
    public static int largestRectangle(ArrayList< Integer > heights) {
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
