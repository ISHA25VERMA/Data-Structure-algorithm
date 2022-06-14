package DsAlgo.Recursions.strings_substrings;

public class RemoveChar {
    public static void main(String[] args) {
        String s = "cadacaaddnb";
        System.out.println(removeChar(s,'a'));
    }
    public static String removeChar(String s, char remove){
        if (s.length() == 0){
            return "";
        }

        if (s.charAt(0) == remove){
            return "" + removeChar(s.substring(1),remove);
        }else {
            return s.charAt(0) + removeChar(s.substring(1), remove);
        }
    }
}
