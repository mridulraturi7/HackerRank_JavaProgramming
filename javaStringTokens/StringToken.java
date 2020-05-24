package javaStringTokens;

import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] broken = s.trim().split("[ !,?._'@]+");

        if(s.trim().equals(""))
        {
            System.out.println("0");
        }

        else if(s.length() > 400000)
        {
            return;
        }

        else
        {
            System.out.println(broken.length);
        }


        for(String a : broken)
        {
            System.out.println(a);
        }

    }
    
}