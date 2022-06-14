package DsAlgo.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class CountBitsAndPosition {
    public static void main(String[] args) {
        System.out.println(getOneBits(37));
    }

    static private List<Integer> getOneBits(int n){
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        int other = n;
        while (n>0){
            count++;
            n -= n & (-n);
        }

        ans.add(count);

        for (int i=1, iter=1; i<256; i = i<<1, iter++) {
            if ((other & i) == 1) {
                ans.add(iter);
            }
        }
        return ans;
    }
}
