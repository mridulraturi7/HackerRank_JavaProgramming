package javaLoops1;

import java.util.Scanner;

public class Loop1 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        new Loop1().printTable(N);

        scanner.close();
    }

    public void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }
    }

}