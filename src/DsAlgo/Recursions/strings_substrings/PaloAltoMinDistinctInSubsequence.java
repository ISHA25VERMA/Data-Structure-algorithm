package DsAlgo.Recursions.strings_substrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PaloAltoMinDistinctInSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,3,4,5,3,4,3};

        System.out.println(Subsequence(arr, 0, new ArrayList<>(), 6));
    }

    public static int Subsequence(int[] arr,int index, ArrayList<Integer> subsequence, int K){
        if(index == arr.length){
            if(subsequence.size() == K){
                Set<Integer> set = new HashSet<>();
                for(int brand : subsequence){
                    set.add(brand);
                }
                return set.size();
            }else{
                return -1;
            }
        }

        int notTaking = Subsequence(arr, index+1, subsequence, K);
        subsequence.add(arr[index]);
        int taking = Subsequence(arr, index+1, subsequence, K);
        subsequence.remove(subsequence.size()-1);

        return Math.min(taking, notTaking);

    }
}
