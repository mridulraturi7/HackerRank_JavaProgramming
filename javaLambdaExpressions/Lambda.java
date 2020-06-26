package javaLambdaExpressions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

interface PerformOperation {
    boolean check(int a);
   }

class MyMath 
{
    public static boolean checker(PerformOperation p, int num) {
     return p.check(num);
    }

    public PerformOperation isOdd()
    {
        PerformOperation p0 = ((int n) -> {
            if(n%2 == 0){
                return false;
            }
            else{
                return true;
            }
        });
        return p0;
    }

    public PerformOperation isPrime()
    {
        PerformOperation p1 = ((int n) -> {
            if(n <= 1){
                return false;
            }

            else if(n == 2){
                return true;
            }

            else if(n%2 == 0){
                return false;
            }

            for(int i = 2; i <= (int)Math.sqrt(n); i++)
            {
                if(n%i == 0)
                {
                    return false;
                }
            }
            return true;
        });
        return p1;
    }

    public PerformOperation isPalindrome()
    {
        PerformOperation p2 = ((int n) -> {
            int num = n;
            int rem = 0, rev_num = 0;
            while(n > 0)
            {
                rem = n%10;
                rev_num = rev_num*10 + rem;
                n = n/10;
            }

            if(num == rev_num)
            {
                return true;
            }

            else
            {
                return false;
            }
        });
        return p2;
    }
}

public class Lambda {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
         String s = br.readLine().trim();
         StringTokenizer st = new StringTokenizer(s);
         int ch = Integer.parseInt(st.nextToken());
         int num = Integer.parseInt(st.nextToken());
         if (ch == 1) {
          op = ob.isOdd();
          ret = MyMath.checker(op, num);
          ans = (ret) ? "ODD" : "EVEN";
         } else if (ch == 2) {
          op = ob.isPrime();
          ret = MyMath.checker(op, num);
          ans = (ret) ? "PRIME" : "COMPOSITE";
         } else if (ch == 3) {
          op = ob.isPalindrome();
          ret = MyMath.checker(op, num);
          ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
      
         }
         System.out.println(ans);
        }
       }
    
}