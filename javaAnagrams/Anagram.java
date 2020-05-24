package javaAnagrams;

import java.util.Scanner;

public class Anagram {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function

        int l1,l2;
        l1=a.length();
        l2=b.length();
        int count=0;

        String c = a.toUpperCase();
        String d = b.toUpperCase();

        int[] freq1 = new int[l1];
        int[] freq2 = new int[l2];

        char[] C = c.toCharArray();
        char[] D = d.toCharArray();

        if(l1 == l2)
        {
            for(int i=0;i<l1;i++)
        {
            freq1[i]=0;
            freq2[i]=0;
            char ch = C[i];
            for(int j=0;j<l2;j++)
            {
                if(ch == C[j])
                {
                    freq1[i]++;
                }

                if(ch == D[j])
                {
                    freq2[i]++;
                }
            }
        }

        for(int i=0;i<l1;i++)
        {
            if(freq1[i]==freq2[i])
            {
                count++;
            }
        }

        }


        if(count == l1)
        {
            return true;
        }

        return false;

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}