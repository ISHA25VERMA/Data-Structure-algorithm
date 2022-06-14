package DsAlgo.Infosys6LPA;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = Integer.parseInt(scan.nextLine().trim());
        List<Integer> x = new ArrayList<>(M);
        for (int j = 0; j<M; j++){
            x.add(Integer.parseInt(scan.nextLine().trim()));
        }
        int result = solve(M,x);
        System.out.println(result);
    }
    public static int solve(int M, List<Integer> x){
//        int[] B = new int[M];
        List<Integer> b = new ArrayList<>();

        for(int i = 0, j =0, k = M-1; i<M; i++ ){
            if (i == 0){
                b.add(x.get(k));
                k--;
            }else if (i%2 == 0){
                b.add(x.get(k));
                k--;
            }else{
                b.add(x.get(j));
                j++;
            }
        }
        System.out.println(b);
        int ans = 0;
        for(int i = 0; i<M; i++){

            int power = (int) Math.pow(10, i+1);
            int temp = b.get(i)*power;
            ans += temp;
        }
//        for (int i = 0, j = M-1; i<M && j>=0; i++, j-- ){
//            B[i] = x.get(j);
//        }
//        System.out.println(Arrays.toString(B));
////        for (int i = 0; i<M; i++){
////            ans += Math.pow(x.get(i)*10,i);
////        }

        return ans;
    }
}
