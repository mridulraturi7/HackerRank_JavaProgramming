package javaReflectionAttributes;

import java.lang.Class;
import java.lang.reflect.*;

public class ReflectionAttributes {

    public static void main(String[] args){
        Student std = new Student();
        Class student = std.getClass(); //~~~Complete this line~~~;
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