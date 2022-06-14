package DsAlgo.Recursions.Backtracking;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean [][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(CountPaths(arr,0,0));
        printPaths(arr,"",0,0);
    }
    public static int CountPaths(boolean [][]arr, int r, int c){
        int ans = 0;
        if (!arr[r][c]){
            return ans;
        }

        if (r == arr.length -1 || c==arr[1].length -1){
            ans+=1;
            return ans;
        }

        ans += CountPaths(arr,r+1,c);
        ans += CountPaths(arr,r,c+1);

        return ans;
    }
    public static void printPaths(boolean [][]arr, String path, int r, int c){
        if (r == arr.length -1 && c == arr[1].length -1){
            System.out.println(path);
            return;
        }
        if ( !arr[r][c]){
            return;
        }

        if (r < arr.length-1){
            printPaths(arr,path+"D",r+1,c);
        }
        if (c < arr[0].length-1){
            printPaths(arr,path+"R",r,c+1);
        }

    }
}
