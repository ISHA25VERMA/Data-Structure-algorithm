package DsAlgo.Recursions.strings_substrings;

public class SkippingStrings {
    public static void main(String[] args) {
        String ans = skipAppIfNotApple("anapplephonehasanapptinderapp");
        System.out.println(ans);
    }

   public static String skipString(String str, String skip){
        if (str.length() == 0){
            return "";
        }
        if (str.startsWith(skip)){
            if (skip.length() == str.length()){
                return "";
            }else{
                return skipString(str.substring(skip.length()), skip);
            }
        }else{
            return str.charAt(0)+skipString(str.substring(1), skip);
        }
   }

   public static String skipAppIfNotApple(String str){
        if (str.length()==0){
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")){
            if (str.length() == 3){
                return "";
            }else{
                return skipAppIfNotApple(str.substring(3));
            }
        }else{
            return str.charAt(0)+skipAppIfNotApple(str.substring(1));
        }

   }
}
