package javaReflectionAttributes;

import java.lang.Class;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;

class Student       //This class is created only for checking the correctness of code.
{
    private String name;
    private String id;
    private String email;

    public String getName() 
    {
        return name;
    }
    public void setId(String id) 
    {
        this.id = id;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public void anothermethod()
    {  
        
    }
    
    /*......
    ......
    some more methods
    ......*/
}

public class ReflectionAttributes 
{
    public static void main(String[] args)
    {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }   
}