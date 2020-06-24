package javaSingletonPattern;

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

}

public class SingletonPattern {


    
}