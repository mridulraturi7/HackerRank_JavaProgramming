package javaArrayList;

import java.util.*;

public class ArrayListExample {

    private static ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
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
        scan.close();
    }

    public static void check(int x, int y)
    {
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