package DsAlgo;

public class AbhiTest1 {
    public static void main(String[] args) {
        String[] name = {"a", "a"};

        System.out.println(minimumChanges(2,1,1,name));
    }
    public static int minimumChanges(int N, int M, int K, String[] Name){
        int result = 0;
        for (int i = 0; i <N-1; i++){
            for(int j = i+1; j<N; j++){
                if (Name[i].equals(Name[j])){
                    for(int k = 0 ; k <M; k++){
                        if (Name[i].charAt(k) < 'a'+k){

                        }
                    }
                }
            }
        }

        return result;
    }
}
