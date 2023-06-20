package DsAlgo.StringHashing;

import java.util.ArrayList;
import java.util.List;
class Pair{
    int n;
    int hash;

    Pair(int hash, int n){
        this.hash = hash;
        this.n = n;
    }
}

public class DuplicateStringsInArray {
    public static void main(String[] args) {
       String[] arr = {"isha", "sneha", "isha", "pankaj", "sahib", "sahib", "sheetal", "divya"};

    }

    private static int computeHash(String s){
        int mod = (int)1e9+9;
        int p = 31;
        int hashValue = 0;
        int power = 1;

        for(int i = 0; i<s.length(); i++){
            hashValue = ((s.charAt(i)-'a'+1)*power)%mod;
            power = p*power;
        }
        return hashValue;
    }
}
