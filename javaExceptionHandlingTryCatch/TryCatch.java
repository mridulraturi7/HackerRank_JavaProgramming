package javaExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    
    public static void main(String[] args) {
        
        try{
            Scanner scan = new Scanner(System.in);

            int x = scan.nextInt();
            int y = scan.nextInt();

            scan.close();

            if(y == 0)
            {
                throw new ArithmeticException("/ by zero");
            }

            else
            {
                System.out.println(x/y);
            }

        }
        catch(InputMismatchException me){
                System.out.println(me.getClass().getName());
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }

    }

}