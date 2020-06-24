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

    public void setStr(String str)
    {
        this.str = str;
    }

}

public class SingletonPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        Singleton s_Object = Singleton.getSingleInstance();
    }
    
}