package javaBasicCertification.howWillYouCompare;

import java.util.Scanner;
import java.util.Arrays;

class Comparator
{
    public boolean compare(int a, int b)
    {
        if(a == b)
        {
            return true;
        }
        return false;
    }

    public boolean compare(String a, String b)
    {
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }

    public boolean compare(int[] a, int[] b)
    {
        if(Arrays.equals(a, b))
        {
            return true;
        }
        return false;
    }
}

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Comparator comp = new Comparator();

        int testCases = Integer.parseInt(scan.nextLine());

        while(testCases-- > 0)
        {
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1 = scan.nextLine().trim();
                    String s2 = scan.nextLine().trim();

                    System.out.println( (comp.compare(s1, s2)) ? "Same" : "Different" );
                    break;
            
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();

                    System.out.println( (comp.compare(num1, num2)) ? "Same" : "Different" );
                
                    if(scan.hasNext()){
                        scan.nextLine();
                    }
                    break;

                case 3:
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];

                    for(int i = 0; i < array1.length; i++)
                    {
                        array1[i] = scan.nextInt();
                    }

                    for(int i = 0; i < array2.length; i++)
                    {
                        array2[i] = scan.nextInt();
                    }

                    System.out.println( (comp.compare(array1, array2)) ? "Same" : "Different" );

                    if(scan.hasNext()){
                        scan.nextLine();
                    }
                    break;
                
                default:
                    System.out.println("Invalid input.");
            }
        }
        scan.close();
    }
}