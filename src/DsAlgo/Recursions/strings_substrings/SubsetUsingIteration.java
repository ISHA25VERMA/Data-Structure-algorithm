package DsAlgo.Recursions.strings_substrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetUsingIteration {
    public static void main(String[] args) {
        System.out.println(subset(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i = 0; i <arr.length; i++){
            int n = outer.size();
            for(int j = 0 ;j <n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
