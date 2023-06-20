package DsAlgo.hashing;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static  String calculateEncrypted(String input){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no  = new BigInteger(1, messageDigest);

            String hashText = no.toString(16);
            while (hashText.length()<32){
                hashText = "0"+hashText;
            }
            return hashText;
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String s = "Hello ISHA";
        System.out.println("Hash message is : "+calculateEncrypted(s));
    }
}
