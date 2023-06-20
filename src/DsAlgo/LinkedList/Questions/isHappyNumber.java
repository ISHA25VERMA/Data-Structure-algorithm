package DsAlgo.LinkedList.Questions;

public class isHappyNumber {
    public static void main(String[] args) {

    }

    public static boolean isHappyNumber(int num){
        int slow = num;
        int fast = num;

        do{
            slow = sumOfSquaresOfDigit(slow);
            fast = sumOfSquaresOfDigit(sumOfSquaresOfDigit(fast));
            if (slow == 1){
                return true;
            }
        }while(fast!=slow);

        return false;
    }

    private static int sumOfSquaresOfDigit(int num) {
        int ans = 0;

        while (num>0){
            int rem = num%10;
            ans += rem*rem;
            num /=10;
        }

        return ans;
    }
}
