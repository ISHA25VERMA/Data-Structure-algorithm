package DsAlgo.Recursions.Backtracking;

public class RightDownDiagonallyAllowed {
    public static void main(String[] args) {
        System.out.println(CountPaths(3,3));
        printPath("",3,3);
    }
    public static int CountPaths(int r, int d){
        int ans = 0;
        if (r == 1 || d==1){
            ans += 1;
            return ans;
        }

        ans += CountPaths(r-1, d-1);//diagonally
        ans += CountPaths(r-1,d); //down
        ans += CountPaths(r,d-1); // right
        return ans;
    }
    public static void printPath(String path, int r, int d){
        if (r==1 && d ==1){
            System.out.println(path);
            return;
        }

        if (r>1){
            printPath(path+"D",r-1,d);
        }
        if (d>1){
            printPath(path+"R", r,d-1);
        }
        if (d>1 && r>1){
            printPath(path+"V",r-1,d-1);
        }
    }
}
