package DsAlgo.Queue.Questions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FirstNegativeElementInWindowOfKsize {
    public static void main(String[] args) {

    }
    public static ArrayList<Long> printFirstNegativeIntegers(long A[], int N, int K){
        Deque<Long> deque = new ArrayDeque<>();
        ArrayList<Long> ans = new ArrayList<>();
        long i;
        for ( i =0; i<K; i++){
            if(A[(int)i]<0){
                deque.push(i);
            }
        }

        if(!deque.isEmpty()){
            ans.add(A[Math.toIntExact(deque.getFirst())]);
        }else{
            ans.add(0L);
        }

        for (i = K; i<N; i++){
            if (!deque.isEmpty() && (i-deque.getFirst()>=K)){
                deque.removeFirst();
            }

            if (A[(int)i]<0){
                deque.push(i);
            }

            if(deque.isEmpty()){
                ans.add(0L);
            }else{
                ans.add(A[Math.toIntExact(deque.getFirst())]);
            }
        }
        return ans;
    }
}
