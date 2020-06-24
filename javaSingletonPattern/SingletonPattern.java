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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        Singleton s_Object = Singleton.getSingleInstance();
    }
    
}