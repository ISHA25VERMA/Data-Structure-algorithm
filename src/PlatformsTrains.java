import java.util.Arrays;

public class PlatformsTrains {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum platforms requires = "+platformsRequired(arr,dep,n));
    }
    public static int platformsRequired(int[] arr,int[]dep, int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform = 1, ans = 1;
        int i = 1, j =0;
        while (i<n && j <n){
            if (arr[i] <= dep[j]) {
                platform++;
                i++;
            }else if(arr[i]>dep[j]){
                platform--;
                j++;
            }

            if (platform > ans) {
                ans = platform;
            }
        }


        return ans;
    }
}
