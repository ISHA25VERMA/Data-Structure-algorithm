package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.*;


public class AmrAndMusic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int k = scan.nextInt();

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.days));

        for(int i = 0; i<n; i++){
            pq.add(new Pair(i+1, scan.nextInt()));
        }

        List<Integer> list = new ArrayList<>();

        while (!pq.isEmpty()){
            Pair temp = pq.remove();
//            System.out.println(temp.index +" "+temp.days);
//            System.out.println(pq);
            if(temp.days<=k){
                k -= temp.days;
                list.add(temp.index);
            }else {
                break;
            }
        }

        System.out.println(list.size());

        for(int indexes : list){
            System.out.print(indexes + " ");
        }
    }
}

class Pair{
    int days;
    int index;

    public Pair(int index, int days){
        this.index = index;
        this.days = days;
    }
}
