package javaBitSet;

import java.util.Scanner;
import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        while(m>0)
        {
            String str = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt();

            if(str.equals("AND"))
            {
                if(a == 1)
                {
                    b1.and(b2);
                }
                else if(a == 2)
                {
                    b2.and(b1);
                }
            }

            else if(str.equals("OR"))
            {
                if(a == 1)
                {
                    b1.or(b2);
                }
                else if(a == 2)
                {
                    b2.or(b1);
                }
            }

            else if(str.equals("XOR"))
            {
                if(a == 1)
                {
                    b1.xor(b2);
                }
                else if(a == 2)
                {
                    b2.xor(b1);
                }
            }

            else if(str.equals("FLIP"))
            {
                if(a == 1)
                {
                    b1.flip(b);
                }
                else if(a == 2)
                {
                    b2.flip(b);
                }
            }

            else if(str.equals("SET"))
            {
                if(a == 1)
                {
                    b1.set(b);
                }
                else if(a == 2)
                {
                    b2.set(b);
                }
            }

        
            System.out.println(b1.cardinality() + " " + b2.cardinality());

            m--;
        }

        scan.close();
        
    }
}