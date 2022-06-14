package DsAlgo.maths;

public class NewtonRaphsonSQRT {
    public static void main(String[] args) {
        System.out.println(root(40));
    }

    public static double root (double n){
        double  x = n;
        double root;
        while (true){
            root = 0.5 * (x + (n/x));

            if (Math.abs(root-x) < 0.2){
                break;
            }

            x = root;
        }

        return root;
    }
}
