package DsAlgo.Recursions.strings_substrings;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println(combinations("","23"));
    }
    public static List<String> combinations (String processed, String unprocessed){
        List<String> ans = new ArrayList<>();

        if (unprocessed.length()==0){
            ans.add(processed);
            return ans;
        }

        int digit  = unprocessed.charAt(0)-'0';

        for(int i = (digit-1)*3 ; i<digit*3;i++){
            char ch = (char)('a'+i);
            ans.addAll(combinations(processed+ch,unprocessed.substring(1)));
        }

        return ans;
    }
}
