package javaOneDArray;

import java.util.Scanner;

public class OneDArray {
    
    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        int j = 0;
        
        while(n > 0)
        {
            a[j] = scan.nextInt();
            j++;
            n--;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    
    }

}