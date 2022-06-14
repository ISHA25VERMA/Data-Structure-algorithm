package DsAlgo.Interview;

import java.util.ArrayList;

public class Questions {
    public static void main(String[] args) {
        if (QuestionsMarks("5??aaaaaaaaaaaaaaaaaaa?5?a??5")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static Boolean QuestionsMarks(String str) {
        // code goes here
        Boolean ans = false;

        int questionMarks = 0;
        ArrayList<Integer> digitList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digitList.add(str.charAt(i) - '0');
            } else if (str.charAt(i) == '?') {
                if (digitList.size()>=1){
                    questionMarks++;
                }
            }

            int length = digitList.size();

            if ( length >= 2 && ((digitList.get(length - 1) + digitList.get(length - 2)) == 10)) {
                if (questionMarks%3 == 0) {
                    ans = true;
                } else {
                    ans = false;
                }
            }
        }
        return ans;
    }
}
