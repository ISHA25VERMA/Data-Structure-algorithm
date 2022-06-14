package DsAlgo.Recursions.strings_substrings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
//        getPermutations("","abc");
        System.out.println(getPermutation("","abc"));
        System.out.println(countPermutations("","abc"));
    }

    public static void getPermutations(String processed, String unprocessed){
        if (unprocessed.length()== 0){
            System.out.println(processed);
            return;
        }
        for(int i = 0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String last = processed.substring(i,processed.length());

            getPermutations(first+unprocessed.charAt(0)+last,unprocessed.substring(1));
        }
    }

    public static ArrayList<String> getPermutation(String processed, String unprocessed){
        ArrayList<String> ans = new ArrayList<>();


        if (unprocessed.length()== 0){
            ans.add(processed);
            return ans;
        }
        for(int i = 0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String last = processed.substring(i,processed.length());
            ans.addAll(getPermutation(first+unprocessed.charAt(0)+last,unprocessed.substring(1)));
        }
        return ans;
    }

    public static int countPermutations(String processed, String unprocessed){
        int ans = 0;
        if (unprocessed.length()== 0){
            ans +=1;
            return ans;
        }

        for(int i = 0; i<=processed.length(); i++){
            String first = processed.substring(0,i);
            String last = processed.substring(i,processed.length());
            ans += countPermutations(first+unprocessed.charAt(0)+last,unprocessed.substring(1));
        }

        return ans;
    }
}
