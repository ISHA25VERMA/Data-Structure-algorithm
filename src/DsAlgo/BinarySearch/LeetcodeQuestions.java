package DsAlgo.BinarySearch;

import java.util.Arrays;

public class LeetcodeQuestions {
    public static void main(String[] args) {
        int[] arr = {-10,12,-20};
    }
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i<arr.length ; i++){
            int check = 2* arr[i];
            for (int j = i+1; j<arr.length; j++){
                if (check == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
