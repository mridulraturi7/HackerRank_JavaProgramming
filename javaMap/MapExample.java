package javaMap;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MapExample {

    public static void main(String []argh)
	{
        Map<String, Integer> myMap = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
        	myMap.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(myMap.containsKey(s))
            {
                System.out.println(s + "=" + myMap.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
	}
    
}