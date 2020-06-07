package javaStack;

import java.util.Scanner;
import java.util.Stack;

public class UsingStack {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		
        while (sc.hasNext())
        {
            String input=sc.next();

            Stack<Character> myStack = new Stack<>();
            for (int i = 0; i < input.length(); i++) 
            {
                if (!myStack.isEmpty()) 
                {
                    switch(input.charAt(i)) 
                    {
                        case '}' : if (myStack.peek() == '{') 
                        {
                            myStack.pop();
                            break;
                        }
                        case ']' : if (myStack.peek() == '[') 
                        {
                            myStack.pop();
                            break;
                        }
                        case ')' : if (myStack.peek() == '(') 
                        {
                            myStack.pop();
                            break;
                        } 
                        default: myStack.push(input.charAt(i));
                    }
                }
                else 
                {
                    myStack.push(input.charAt(i));
                }
            }
            
            System.out.println(myStack.isEmpty());
        } 
        sc.close();
    }
    
}