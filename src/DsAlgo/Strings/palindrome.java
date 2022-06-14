package DsAlgo.Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "abcdiba";
        int st = 0;
        int ed = str.length()-1;
        boolean isPalindrome = true;
        while (st!=ed){
            if(str.charAt(st) != str.charAt(ed)){
                isPalindrome = false;
                break;
            }
            st++;
            ed--;
        }

        if(isPalindrome){
            System.out.println("Yes");
        }else {
            System.out.println("no");
        }
    }
}
