package DsAlgo.Recursions.strings_substrings;

public class NumberOfDiceRollsWithTarget {
    public static void main(String[] args) {
        int ans = diceRolls("",4);
        System.out.println("number of combinations = "+ ans);
    }
    public static int diceRolls(String processed, int target){
        int ans = 0;
        if (target == 0){
            System.out.println(processed);
            ans += 1;
            return ans;
        }
        for (int i = 1; i<= 6 && i<=target;i++){
            ans += diceRolls(processed+i,target-i);
        }
        return ans;
    }
}
