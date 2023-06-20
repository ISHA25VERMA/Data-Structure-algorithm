package DsAlgo.Recursions;

public class DieRollsToGetTarget {
    public static void main(String[] args) {
        //not an optimized solution
        //can be optimized only after reading about dynamic programming
        System.out.println(rolls(0,7,2,6 ));
    }
    public static int numRollsToTarget(int n, int k, int target) {
        return 0;
    }

    public static void rooollss (String processed, int target, int n){
        if (target == 0){
            System.out.println(processed);
        }

        if (n<=0){
            return;
        }

        for (int i = 1; i<=6; i++){
            rooollss(processed+i, target-i, n-1);
        }
    }

    public static int rolls(int sum, int target, int n, int k){

        if (target == 0){
            return 1;
        }
        if (n<=0){
            return 0;
        }
        int count = 0;

        //if one i is not less than target then there is no point of checking further i's hence
        //added in loop condition
        //hence the loop will not run further
        for(int i = 1; i<=k && i<=target; i++){
            if (i<=target){
                count += rolls(i+sum, target-i, n-1, k);
            }
        }

        return count;

    }
}
