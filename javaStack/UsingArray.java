package javaStack;

import java.util.Scanner;

public class UsingArray {

    public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
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
		
    }
    
    public static boolean check(String str)
    {
        int length = str.length();
        //int mid = length/2;
        //int push = 0, pop = 0;
        char[] array = str.toCharArray();

        //Stack<Character> myStack = new Stack<Character>();

    for(int i = 0; i < length; i++)
    {
        if(array[i] == '(')
        {
            //myStack.push(array[i]);
            for(int j = i+1; j < length; j++)
            {
                if(array[j] == ')')
                {
                    array[i] = 'v';
                    array[j] = 'v';
                    break;
                    //char ch = myStack.pop();
                }
            }
        }

        else if(array[i] == '{')
        {
            //myStack.push(array[i]);
            for(int j = i+1; j < length; j++)
            {
                if(array[j] == '}')
                {
                    array[j] = 'v';
                    array[i] = 'v';
                    break;
                    //char ch = myStack.pop();
                }
            }
        }

        else if(array[i] == '[')
        {
            //myStack.push(array[i]);
            for(int j = i+1; j < length; j++)
            {
                if(array[j] == ']')
                {
                    array[j] = 'v';
                    array[i] = 'v';
                    break;
                    //char ch = myStack.pop();
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