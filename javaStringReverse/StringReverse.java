package javaStringReverse;

import java.util.Scanner;

public class StringReverse 
{    
    public static void main(String[] args) 
    {    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String C = "";

        for(int i=A.length()-1;i>=0;i--)
        {
            for(int j=0;j<A.length();j++)
            {
                char[] B = A.toCharArray();
                B[j] = A.charAt(i);
                C = String.valueOf(B);
            }
        }

        if(A.equals(C))
        {
            System.out.println("Yes");
        }

        else
        {
            System.out.println("No");
        }

        sc.close();
        
    }
}