package DsAlgo.StringHashing;

//https://codeforces.com/contest/271/problem/D

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Hashes{
    int hash1;
    int hash2;

    Hashes(int hash1, int  hash2){
        this.hash1 = hash1;
        this.hash2 = hash2;
    }

    public boolean equals(Object o){
        if(o instanceof Hashes){
            Hashes hashes = (Hashes)o;
            return (hashes.hash1 == hash1) && (hashes.hash2 == hash2);
        }

        return false;
    }

    public int hashCode(){
        return Integer.hashCode(hash2)*31 + Integer.hashCode(hash1)*31;
    }
}

public class GoodSubstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String good_bad = scan.nextLine();
        int k = scan.nextInt();

        Set<Hashes> set = new HashSet<>();

        int p1 = 31,  p2 = 29;
        int mod = (int)1e9+7;

        for(int i = 0; i<str.length(); i++){

            int hash1 = 0, hash2 =0 ;
            int pow1 = 1, pow2 = 1;
            int count = 0;

            for(int j = i ; j<str.length(); j++){
                char ch = str.charAt(j);
                if(good_bad.charAt(ch-'a') == '0'){
                    count ++;
                }
                if(count > k) break;

                hash1  = (hash1 + ((ch-'a'+1)*pow1))%mod;
                hash2 = (hash2 + ((ch-'a'+1)*pow2))%mod;

                set.add(new Hashes(hash1, hash2));

                pow1 = (pow1*p1)%mod;
                pow2 = (pow2*p2)%mod;
            }
        }
        System.out.println(set.size());

    }

}
