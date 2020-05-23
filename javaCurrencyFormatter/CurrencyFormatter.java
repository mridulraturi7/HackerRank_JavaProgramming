package javaCurrencyFormatter;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat nf = NumberFormat.getInstance();
        String us = nf.getCurrencyInstance(Locale.US).format(payment);
        String china = nf.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = nf.getCurrencyInstance(Locale.FRANCE).format(payment);

        Locale l = new Locale("en","IN");

        String india = nf.getCurrencyInstance(l).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}