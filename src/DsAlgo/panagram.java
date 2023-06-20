package DsAlgo;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

class UserMainCodes{
    public int panagram(int input1, String[] input2, int[] input3){
        sort(input2, input2.length);
        int ans = 0;
        boolean[] mark = new boolean[26];
        for (int i = input2.length-1; i>=0; i--){
            boolean str = false;
            for (int j =0; j<input2[i].length(); j++){
                int index = input2[i].charAt(j)-'a';
                if (!mark[index]){
                    mark[index] = true;
                    if (!str){
                        ans += 1;
                        str= true;
                    }
                }

            }
        }
        for (int i = 0; i<mark.length;i++){
            if (mark[i]==false){
                return -1;
            }
        }
        return ans;
    }
    void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }

    }
}

public class panagram {
    public static int panagram(int input1, String[] input2){
        sort(input2, input2.length);
        int ans = 0;
        boolean[] mark = new boolean[26];
        for (int i = input2.length-1; i>=0; i--){
            boolean str = false;
            for (int j =0; j<input2[i].length(); j++){
                int index = input2[i].charAt(j)-'a';
                if (!mark[index]){
                    mark[index] = true;
                    if (!str){
                        ans += 1;
                        str= true;
                    }
                }

            }
        }
        return ans;
    }
    static void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }

    }
    public static void main(String[] args) {
        String[] str = {"quick","the", "quick", "brown", "fox", "jumps", "over","a",  "lazy", "dog","a"};
        sort(str, str.length);
        System.out.println(Arrays.toString(str));

        System.out.println(panagram(14, str));
    }
}
