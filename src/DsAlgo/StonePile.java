package DsAlgo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StonePile {
    public static void main(String[] args) {
        int[] A = {1,1000};
        System.out.println(solve(2,100,A));
    }
    static int solve(int N, int K, int[] A){
        int result = 0;
        int i = 0;
        int j = i+1;
        for(int index = 0; j < N && index<K; index++){
            A[i] += 1;
            A[j] -= 1;

            if (i == N-2){
                i = 0;
                j = i+1;
            }else{
                i++;
                j++;
            }
        }

        for(int a = 0; a<A.length; a++){
            result = Math.max(result, A[a]);
        }
        return result;
    }
}
