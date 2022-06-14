package DsAlgo.Recursions.strings_substrings;

public class Substrings {
    public static void main(String[] args) {
        subsequence("", "abc");

    }
    public static void subsequence(String processed, String Unprocessed){
        if(Unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        subsequence(processed + Unprocessed.charAt(0), Unprocessed.substring(1));
        subsequence(processed, Unprocessed.substring(1));
    }
}
