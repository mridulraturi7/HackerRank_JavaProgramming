package javaMD5;

import java.util.Scanner;

public class MD5Example {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(getMD5(str));

        scan.close();
    }
    
}