package DsAlgo.Recursions.Backtracking;

public class MazePath {
    public static void main(String[] args) {
        printPath("",3,3);
    }
    public static void printPath(String path, int r, int d){
        if (r == 1 && d == 1){
            System.out.println(path);
            return;
        }

        if (r>1){
            printPath(path+"D",r-1,d);  //down
        }
        if (d>1){
            printPath(path+"R", r, d-1);  //right
        }
    }
}
