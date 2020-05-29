package javaList;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        List<Integer> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while(n > 0)
        {
            int num = scan.nextInt();
            list.add(num);
            n--;
        }

        int q = scan.nextInt();
        while(q > 0)
        {
            String str = scan.next();
            if(str.equals("Insert"))
            {
                int a = scan.nextInt();
                int b = scan.nextInt();
                list.add(a,b);
            }

            else if(str.equals("Delete"))
            {
                int d = scan.nextInt();
                list.remove(d);
            }
            
            q--;
        }

        scan.close();

        for(int i : list)
        {
            System.out.printf("%d ", i);
        }
    }
    
}