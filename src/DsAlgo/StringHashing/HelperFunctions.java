package DsAlgo.StringHashing;

public class HelperFunctions {

    public int add(int a, int b, int mod){
        int res = (a+b)%mod;
        if(res<0){
            res+= mod;
        }
        return res;
    }

    public int mul(int a, int b, int mod){
        // a*1LL*b;
        int res = (a*b)%mod;
        if(res<0){
            res += mod;
        }
        return res;
    }

    public int power(int a, int b, int mod){
        int res = 1;
        //binary exponentiation method of calculating a power b
        while(b!= 0){
            if(b%2 == 1){
                res = mul(res, a, mod);
            }
            a = mul(a, a, mod);
            b /= 2;
        }
        return res;
    }
}
