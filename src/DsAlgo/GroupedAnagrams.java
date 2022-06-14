package DsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupedAnagrams {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("inch");
        words.add("cat");
        words.add("chin");
        words.add("kit");
        words.add("act");

//        System.out.println(3&5);
//        System.out.println(3|5);
//        boolean[] hello = new boolean[5];
//        System.out.println(Arrays.toString(hello));
        System.out.println(getGroupedAnagrams(words));
    }

    public static int getGroupedAnagrams(List<String> words){
        int ans = 0;

        for(int i = 0; i<words.size(); i++){
            char []tempArray = words.get(i).toCharArray();
            Arrays.sort(tempArray);

            words.set(i, Arrays.toString(tempArray));
        }

        boolean []checked = new boolean[words.size()];
        for (int i = 0; i<words.size();i++){
            if(checked[i]){
                continue;
            }
            ans+=1;
//            boolean group = false;
            for(int j = i+1; j<words.size();j++){
                if (words.get(i).equals(words.get(j))){
                    checked [j] = true;
//                    group = true;
                }
            }
        }

        return ans;
    }
}
