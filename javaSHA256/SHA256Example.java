package javaSHA256;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class SHA256Example {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        findSHA256Hash(str);
    }

    public static void findSHA256Hash(String str)
    {
        try
        {
            MessageDigest mD = MessageDigest.getInstance("SHA-256");

            byte[] messageDigest = mD.digest(str.getBytes());

            BigInteger bD = new BigInteger(1, messageDigest);

            String hashValue = bD.toString(16);

            while(hashValue.length() < 64)
            {
                hashValue = "0" + hashValue;
            }

            System.out.println(hashValue);
        }
        catch(NoSuchAlgorithmException aE)
        {
            throw new RuntimeException(aE);
        }
    }
    
}