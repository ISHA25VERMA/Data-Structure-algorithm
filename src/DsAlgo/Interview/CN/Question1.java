package DsAlgo.Interview.CN;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<String> words = new ArrayList<>();
        for(int i = 1; i<=n;i++ ){
            words.add(scan.next());
        }

        char[] queries = new char[n];

        for (int i = 0; i<n; i++){
            queries[i] = scan.next().charAt(i);
        }

    }


    public static void zig_zag(List<String> words, char[] queries) {

        String lexo = lexographicShortest(words);
        //Your Code goes here
        int n =queries.length;
        for(int i = 0; i<queries.length; i++){
            char ch = queries[i];
            boolean found = false;
            for(int j =0; j<words.size(); j++){
                if(words.get(i).startsWith(""+ch)){
                    found = true;
                    System.out.println(words.get(i));
                    break;
                }
            }

            if(!found){
                System.out.println(lexo);
            }
        }
    }

    private static String lexographicShortest(List<String> words){
        String ans = "";
        for(int i = 0; i<words.size();i++ ){
            if (i<words.size()-1 && words.get(i+1).compareTo(words.get(i)) > 0){
                ans = words.get(i+1);
            }
        }

        return ans;
    }
}
