package javaRegex;

import java.util.Scanner;

public class Regex {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }

}

class MyRegex{
    String eachDigit 
            = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])"; 

    String pattern = eachDigit + "\\." + eachDigit + "\\." + eachDigit + "\\." + eachDigit;
}
