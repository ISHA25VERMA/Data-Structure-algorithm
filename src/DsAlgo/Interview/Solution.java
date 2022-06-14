package DsAlgo.Interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        String str = "bbbab";
        System.out.println(solution(str));
    }

    public static int solution(String S){
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            int count = 1;
            for (int j = i+1;j<S.length() && S.charAt(j) == ch ; j++){
                count+=1;
                i++;
            }
            System.out.println(count);
            list.add(count);
        }

        int maxElement = Collections.max(list);

        for(int i = 0; i<list.size(); i++){
            if (list.get(i)<maxElement){
                ans += (maxElement - list.get(i));
            }
        }

        return ans;
    }
}
