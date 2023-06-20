package DsAlgo.DynamicProgramming;

public class PalindromePartitioningMinCuts {
    public static void main(String[] args) {
        System.out.println(min(0, "bb")-1);
    }
    private static int min(int start, String s){

        int ans = Integer.MAX_VALUE;

        for(int end = start; end<s.length(); end++){
            if(isPalindrome(s.substring(start, end))){
                int currentAns = 1 + min(end+1, s);
                ans = Math.min(currentAns, ans);
            }
        }

        return ans;

    }

    private static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!= s.charAt(j))return false;
            i++;
            j--;
        }

        return true;
    }
}
