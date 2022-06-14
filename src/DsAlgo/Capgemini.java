package DsAlgo;

import java.util.ArrayList;
import java.util.List;

public class Capgemini {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(-3);
        list.add(-4);
        list.add(7);
        list.add(5);
        list.add(-2);
        System.out.println(requiredAmountAtStart(list));
    }

    public static int requiredAmountAtStart(List<Integer> netSaving){
        int dayMoney = 0;
        int ans = 0;
        for(int i = 0; i<netSaving.size(); i++){
            dayMoney += netSaving.get(i);
            if (dayMoney <0 ){
                ans += -(dayMoney)+1;
                dayMoney += ans; //yeh line add krou
            }
        }

        return ans;
    }
}
