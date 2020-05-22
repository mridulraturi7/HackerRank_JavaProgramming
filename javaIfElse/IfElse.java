package javaIfElse;

import java.util.Scanner;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        new IfElse().check(N);

        scanner.close();
    }

    public void check(int n)
    {
        if((n%2)!=0)
        {
            System.out.println("Weird");
        }

        else if((n%2)==0)
        {
            if((n>=2 && n<=5))
            {
                System.out.println("Not Weird");
            }

            else if((n>=6 && n<=20))
            {
                System.out.println("Weird");
            }

            else
            {
                System.out.println("Not Weird");
            }
        }

    }
    
}