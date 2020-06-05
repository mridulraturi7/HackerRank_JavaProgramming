package javaArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {

    private static ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //scan.nextLine();
        int j = 0;

        while(n>0)
        {
            int m = scan.nextInt();

            if(m == 0)
            {
                myList.add(new ArrayList<Integer>());
            }
            
            else
            {
                for(int i = 0; i < m; i++)
            {
                int val = scan.nextInt();
                myList.add(new ArrayList<Integer>());
                myList.get(j).add(val);
            }
            }
            
            j++;
            n--;
        }

        int q = scan.nextInt();
        while(q>0)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            check(x,y);
            q--;
        }
    }
    
}