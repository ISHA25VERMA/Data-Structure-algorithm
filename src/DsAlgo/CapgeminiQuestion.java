package DsAlgo;
class VowelManipulation{
    public StringBuilder manipulativeVowels(String str){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                ans.append("b");
            }else {
                ans.append(str.charAt(i));
            }
        }

        return ans;
    }
}

public class CapgeminiQuestion {
    public static void main(String[] args) {
        VowelManipulation myManipulation = new VowelManipulation();
        String str = "capgemini";
        System.out.println(myManipulation.manipulativeVowels(str));
    }
}
