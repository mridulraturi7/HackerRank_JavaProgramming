package javaSubArray;

import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int l = 0;
        int[] array = new int[n];
        while(n>0)
        {
            array[l] = scan.nextInt();
            l++;
            n--;
        }

        scan.close();

        int count = 0;

        for(int i = 0; i < array.length; i++)
        {
            for(int j = i; j < array.length; j++)
            {
                int sum = 0;
                for(int k = i; k <= j; k++)
                {
                    sum = sum + array[k];
                }
                if(sum < 0)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
        
    }
    
}