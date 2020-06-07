package javaStack;

public class BalancedStack {

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
    
}