package DsAlgo.Recursions.strings_substrings;

public class SkippingStrings {
    public static void main(String[] args) {
        String ans = skipString("anishaanan","an");
        System.out.println(ans);
    }

    public static String skipString(String str, String skip){
        if (str.length()==0){
            return "";
        }

        if (str.substring(0,skip.length()).equals(skip)){
            return skipString(str.substring(skip.length()),skip);
        }
        else {
            return str.substring(0,skip.length())+skipString(str.substring(skip.length()),skip);
        }
    }
}
