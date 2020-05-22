package javaEndOfFile;

import java.util.Scanner;

public class EOF {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count=1;

        while(scanner.hasNext())
        {
            String str = scanner.nextLine();
            System.out.printf("%d %s\n",count,str);
            count++;
        }

        scanner.close();

    }

}