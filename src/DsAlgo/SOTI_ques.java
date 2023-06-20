package DsAlgo;

class UserMainCode{
    public int longestSpecialSubsequence(int input1, String input2, int input3, String input4){
        return lcs(input2, input4, input1, input3);
    }

    int lcs( String X, String Y, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if ((X.charAt(m-1) == Y.charAt(n-1)-1)||(X.charAt(m-1) == Y.charAt(n-1)+1))
            return 1 + lcs(X, Y, m-1, n-1);
        else
            return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
    }

    /* Utility function to get max of 2 integers */
    int max(int a, int b)
    {
        return (a > b)? a : b;
    }
}

public class SOTI_ques {

    public static void main(String[] args) {
        String X= "adaa";
        String Y = "cbb";

//        System.out.println(longestSpecialSubsequence(X.length(), X, Y.length(), Y));
    }
}
