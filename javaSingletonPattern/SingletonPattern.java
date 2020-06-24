package javaSingletonPattern;

import java.util.Scanner;

class Singleton{
    
    public String str;
    
    private static Singleton singleObj = new Singleton();
    
    private Singleton()
    {
        
    }
    
    public static Singleton getSingleInstance()
    {
        return singleObj;
    }

    //The following getter and setter methods have been used just to run the code on the local machine. However,
    //the problem does not expect us to write the following getter and setter methods.

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

}

public class SingletonPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        scan.close();

        Singleton s_Object = Singleton.getSingleInstance();

        s_Object.setStr(str);

        System.out.println("Hello I am " + s_Object.getClass() + ". " + "Let me say " + s_Object.getStr() + " to you.");
    }
    
}