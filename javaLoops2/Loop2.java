package javaLoops2;

import java.util.Scanner;

public class Loop2 {    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            new Loop2().printSeries(a,b,n);
            System.out.printf("%n");

        }
        in.close();
    }

    public void printSeries(int a,int b,int n)
    {
        int res=0,power=1;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                res=a+b;
            }

            else if(i!=0)
            {
                power*=2;
                res=res+(power*b);
            }

            System.out.printf("%d ",res);
        }
    }

}