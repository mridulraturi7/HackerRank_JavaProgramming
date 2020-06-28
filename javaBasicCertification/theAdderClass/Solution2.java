package javaBasicCertification.theAdderClass;

import java.util.Scanner;

abstract class Calculator{
    abstract int add(int a, int b);
}

public class Solution2 {

    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)){
            a = scan.nextInt();
            b = scan.nextInt();
        }
    }
    
}