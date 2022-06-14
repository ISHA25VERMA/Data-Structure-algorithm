package DsAlgo.Recursions.Backtracking;

public class MazePathsCounter {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }
    public static int maze(int r, int d){
        int ans = 0;
        if (r == 1 || d == 1){
            ans += 1;
            return ans;
        }

        ans += maze(r,d-1);  //right
        ans += maze(r-1,d);  //down
        return ans;

    }

}
