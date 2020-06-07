package javaStack;

import java.util.Scanner;

public class UsingArray {

    public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {

			String input=sc.next();
            boolean ch = check(input);

            if(ch == true)
            {
                System.out.println("true");
            }

            else
            {
                System.out.println("false");
            }
        }
        
        sc.close();
		
    }
    
    public static boolean check(String str)
    {

        int length = str.length();
        char[] array = str.toCharArray();

        for(int i = 0; i < length; i++)
        {
            if(array[i] == '(')
            {
                for(int j = i+1; j < length; j++)
                {
                    if(array[j] == ')')
                    {
                        array[i] = 'v';
                        array[j] = 'v';
                        break;
                    }
                }
            }

            else if(array[i] == '{')
            {
                for(int j = i+1; j < length; j++)
                {
                    if(array[j] == '}')
                    {
                        array[j] = 'v';
                        array[i] = 'v';
                        break;
                    }
                }
            }

            else if(array[i] == '[')
            {
                for(int j = i+1; j < length; j++)
                {
                    if(array[j] == ']')
                    {
                        array[j] = 'v';
                        array[i] = 'v';
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < length; i++)
        {
            if(array[i] != 'v')
            {
                return false;
            }
        }

        return true;

    }
    
}