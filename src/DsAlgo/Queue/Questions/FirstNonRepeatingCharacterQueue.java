package DsAlgo.Queue.Questions;
import java.util.*;
import java.util.Queue;

public class FirstNonRepeatingCharacterQueue {
    public static void main(String[] args) {

    }

    public String FirstNonRepeating(String A)
    {
        // code here
        int[] count = new int[26];
        Queue<Character> q = new LinkedList<>();
        String ans = "";

        for (int i  = 0; i<A.length(); i++){
            char ch = A.charAt(i);
            count[ch-97]++;

            q.add(ch);

            while(!q.isEmpty()){
                if (count[q.peek()-97]>1){
                    q.remove();
                }else{
                    ans = ans+q.peek();
                    break;
                }
            }

            if (q.isEmpty()){
                ans = ans+"#";
            }

        }

        return ans;
    }
}
