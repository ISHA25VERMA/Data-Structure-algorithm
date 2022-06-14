package DsAlgo.maths;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr= {34,25,6,8,12,45,67,76,34,23};
        System.out.println("Second highest : "+secondHighest(arr));
    }
    public static int secondHighest(int []arr){
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }
}
