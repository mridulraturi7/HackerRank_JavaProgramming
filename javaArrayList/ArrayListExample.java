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

    public static void check(int x, int y)
    {
       /*         //int value = myList.get(x-1).get(y-1);
                if(x-1 < myList.size() && y-1 < myList.get(x-1).size())
                {
                    if(myList.get(x-1).get(y-1) != null)
                    {
                        System.out.println(myList.get(x-1).get(y-1));
                    }
                }

                else
                {
                    System.out.println("ERROR!");
                }*/
        try
        {
            System.out.println(myList.get(x-1).get(y-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }
    }
    
}