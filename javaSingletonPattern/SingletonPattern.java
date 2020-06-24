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