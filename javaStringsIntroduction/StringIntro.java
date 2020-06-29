package javaStringsIntroduction;

import java.util.Scanner;

public class StringIntro {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int l1,l2,sum;
        l1=A.length();
        l2=B.length();

        sum = l1 + l2;

        System.out.println(sum);
        
        int res = A.compareTo(B);

        if(res>0)
        {
            System.out.println("Yes");
        }

        else
        {
            System.out.println("No");
        }

        String s1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String s2 = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(s1 + " " + s2);

        sc.close();

    }

}