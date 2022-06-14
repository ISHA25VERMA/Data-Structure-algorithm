package DsAlgo.BitManipulation;

public class ArrayElementWithSingleOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 1,2, 5, 4,5,1};
        int ans = arr[0];
        for (int i = 1; i<arr.length ; i++){
            ans ^= arr[i];
        }

        System.out.println(ans);
    }
}
