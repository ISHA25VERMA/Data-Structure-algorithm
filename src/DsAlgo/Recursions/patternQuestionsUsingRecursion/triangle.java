package DsAlgo.Recursions.patternQuestionsUsingRecursion;

public class triangle {
    public static void main(String[] args) {
        printUltaTriangle(4,1);
        System.out.println();
        printSeedhaaTriangle(4,1);
    }
    public static void printUltaTriangle(int r, int c){
        if (r <= 0){
            return;
        }
        if (c<=r){
            System.out.print("*");
            printUltaTriangle(r,c+1);
        }else{
            System.out.println();
            printUltaTriangle(r-1,1);
        }
    }
    public static void printSeedhaaTriangle(int r, int c){
        if (r <= 0){
            return;
        }
        if (c<=r){
            printSeedhaaTriangle(r,c+1);
            System.out.print("*");
        }else{
            printSeedhaaTriangle(r-1,1);
            System.out.println();
        }
    }
}
