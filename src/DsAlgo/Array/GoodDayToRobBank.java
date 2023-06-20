package DsAlgo.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodDayToRobBank {
    public static void main(String[] args) {
        int[] security = {1,2,5,4,1,0,2,4,5,3,1,2,4,3,2,4,8};
        int time = 2;
        List<Integer> ans = goodDaysToRobBank(security, time);
        System.out.println(ans);
    }
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans = new ArrayList<>();
        if (time ==0){
            for (int i =0; i<security.length;i++ ){
                ans.add(i);
            }
            return ans;
        }

        for (int i = time; i<security.length-time; i++){
            int st = i-time;
            int day = i;
            int ed = i+time;
            boolean check = checkDayGoodToRob(security, day, st, ed);
            if (check){
                ans.add(i);
            }
        }

        return ans;
    }

    public static boolean checkDayGoodToRob(int[] arr, int day, int start, int end){
        for (int i = start; i<day; i++){
            if (arr[i]<arr[i+1]){
                return false;
            }
        }

        for (int i = day+1; i<=end; i++){
            if (arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
