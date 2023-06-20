package DsAlgo.Queue.Questions;

import java.util.Deque;
import java.util.LinkedList;

public class SumMaxMinOfSubarrayOfKSize {
    public static void main(String[] args) {
        int[] arr  = {2,5,-1,7,-3,-1,-2};

        System.out.println(sumOfMaxMinOfKsubarrays(arr,4));
    }

    public static int sumOfMaxMinOfKsubarrays(int[] arr, int k){
        int sum = 0;
        Deque<Integer> max = new LinkedList<>();
        Deque<Integer> min = new LinkedList<>();

        for (int i = 0; i<k; i++){
            while(!max.isEmpty() && arr[max.getLast()] <= arr[i]){
                max.removeLast();
            }

            while (!min.isEmpty() && arr[min.getLast()]>=arr[i]){
                min.removeLast();
            }

            max.add(i);
            min.add(i);
        }


        for(int i = k; i<arr.length; i++){
            sum += arr[max.getFirst()]+arr[min.getLast()];

            //removal
            while(!max.isEmpty() &&( (i - max.peekFirst())>=k)){
                max.pop();
            }

            while (!min.isEmpty() &&( i-min.peekFirst()>=k)){
                min.removeFirst();
            }

            //add
            if(!max.isEmpty() && (arr[max.peekLast()] <= arr[i])){
                max.removeFirst();
            }

            if (!min.isEmpty() && (arr[min.peekLast()]>=arr[i])){
                min.removeLast();
            }

            max.addLast(i);
            min.addLast(i);


        }

        sum += arr[max.getFirst()]+arr[min.getLast()]  ;

        return sum;
    }
}
