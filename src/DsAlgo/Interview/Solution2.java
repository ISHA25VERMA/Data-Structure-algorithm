package DsAlgo.Interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] blocks){
        ArrayList<Integer> ansList = new ArrayList<>();

        for(int i = 0; i<blocks.length; i++){
            int j = i;
            while(j>0 && blocks[j-1]>=blocks[j]){
                j--;
            }
            int k =i;
            while (k<blocks.length-1 && blocks[k+1]>=blocks[k]){
                k++;
            }
//            System.out.println(k-j+1);
            ansList.add(k-j+1);
        }

        return Collections.max(ansList);
    }
}
