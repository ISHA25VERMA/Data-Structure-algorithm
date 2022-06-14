import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[99];
        for (int i = 0; i<99; i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<99; i++){
            sum+= arr[i];
        }
        System.out.println("Missing numer = " + ((100*101)/2- sum));
    }
}
