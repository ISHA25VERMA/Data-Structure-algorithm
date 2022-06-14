package DsAlgo.Stack.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(3);

        System.out.println(nextSmallerElement(arr,4));
    }
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){


        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        ArrayList<Integer> ans = new ArrayList<>();


        for (int i = n-1; i>=0; i-- ){
            int element = arr.get(i);
            while(stack.peek() >= element){
                stack.pop();
            }
            ans.add(stack.peek());
            stack.push(element);
        }

        Collections.reverse(ans);

        return ans;
    }
}
