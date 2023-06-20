package DsAlgo.Codeforces.Competition2;

import java.util.*;

class Node{
    int val;
    int index;
    public Node(int val, int index){
        this.val = val;
        this.index = index;
    }
}

public class FriendlySpiders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int source = scan.nextInt();
        int target = scan.nextInt();

        if(source == target){
            System.out.println(1);
            System.out.println(source);
        }else if(gcd(arr[source-1], arr[target-1]) != 1){
            System.out.println("2");
            System.out.println(source+" "+ target);
        }else{
            Queue<Node> q = new ArrayDeque<>();
            int steps = 0;
            int[] parent = new int[n];
            q.add(new Node(arr[source-1], source-1));
            int[] visited = new int[n];
            visited[source-1] = 1;
            boolean foundAns = false;
            while (!q.isEmpty()){
                int size = q.size();
                for(int i = 0; i<size; i++){
                    Node peek = q.remove();
                    int value = peek.val;
                    int index = peek.index;
                    for(int j = 0; j<n;j++){
                        if(arr[j]!= value && visited[j] == 0 && gcd(arr[j], value)!=1){
                            visited[j] = 1;
                            parent[j] = index;
                            q.add(new Node(arr[j], j));
                            if(arr[j] == arr[target-1]){
                                foundAns = true;
                                int s = j;
                                Stack<Integer> stack = new Stack<>();
                                stack.add(j+1);
                                while(parent[s]!= 0){
                                    stack.add(parent[s]+1);
                                    s = parent[s];
                                }
                                System.out.println(stack.size());
                                while (!stack.isEmpty()){
                                    System.out.print(stack.pop()+" ");
                                }
                                break;
                            }

                        }
                    }

                }
                steps += 1;
            }
            if(!foundAns){
                System.out.println(-1);
            }
        }

    }

    public static int gcd(int a, int b ){
        if(a==0){
            return b;
        }
        return gcd((b%a), a);
    }
}
