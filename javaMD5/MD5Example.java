package javaMD5;

import java.util.Scanner;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Example 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(getMD5(str));

        scan.close();
    }

    public static String getMD5(String str)
    {
        try
        {
            MessageDigest mD = MessageDigest.getInstance("MD5");

            byte[] messageDigest = mD.digest(str.getBytes());

            BigInteger bI = new BigInteger(1, messageDigest); //for converting byte array into signum representation

            String hashValue = bI.toString(16);   //16 for hex value

            while(hashValue.length() < 32)
            {
                hashValue = "0" + hashValue;
            }

            return hashValue;
        }
        catch(NoSuchAlgorithmException aE)
        {
            throw new RuntimeException(aE);
        }
    } 
}