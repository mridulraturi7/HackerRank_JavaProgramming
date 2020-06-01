package javaBigInteger;

import java.util.Scanner;

public class BigIntegerExample {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);

        System.out.println(c);
        System.out.println(d);

    }
    
}