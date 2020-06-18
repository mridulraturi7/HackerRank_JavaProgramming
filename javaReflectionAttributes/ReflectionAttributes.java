package javaReflectionAttributes;

import java.lang.Class;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    
    /*......
    ......
    some more methods
    ......*/
}

public class ReflectionAttributes {

    public static void main(String[] args){
        //Student std = new Student();
        Class student = Student.class; //~~~Complete this line~~~;
        Method[] methods = student.getDeclaredMethods();//~~~Complete this line~~~;

        ArrayList<String> methodList = new ArrayList<>();
        //for(~~~Complete this line~~~){
        for(Method method : methods){
            //methodList.add(~~~Complete this line~~~);
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
    
}