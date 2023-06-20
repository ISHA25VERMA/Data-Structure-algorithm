package DsAlgo.Codeforces;

import java.util.*;

public class permu {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t!= 0){
            int n = scan.nextInt();
            List<Integer> ans = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            int[] visited = new int[n+1];
            int[] min_distincts = {(int)1e9};
            ans = permutation(ans, cur, new HashMap<>(), n, min_distincts, visited, 1);
            System.out.println(ans);
            t--;
        }

    }

    private static List<Integer> permutation (List<Integer> ans, List<Integer> cur, Map<Integer, Integer> map, int n, int[] min_distincts, int[] visited, int pos){
        if(cur.size() == n){
            // System.out.println(cur);
            if(map.size() < min_distincts[0]){
                // System.out.println(map.size());
                ans = new ArrayList<>(cur);
                min_distincts[0] = map.size();
                return ans;
            }
            return ans;
        }

        for(int i = 1; i<= n; i++){
            if(visited[i] == 0 && (i != pos)){
                visited[i] = 1;
                cur.add(i);
                if(map.containsKey(i%pos)){
                    map.put(i%pos, map.get(i%pos)+1);
                }else{
                    map.put(i%pos, 1);
                }
                ans = permutation(ans, cur, map, n,min_distincts, visited, pos+1);
                visited[i] = 0;
                cur.remove(cur.size()-1);
                int a = map.get(i%pos);
                if(a == 1){
                    map.remove(i%pos);
                }else{
                    map.put(i%pos, map.get(i%pos)-1);
                }
            }
        }

        return ans;

    }
}
