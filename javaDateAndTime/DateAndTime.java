package javaDateAndTime;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class Result {

    public static String findDay(int day, int month, int year) {

        LocalDate ld = LocalDate.of(year,month,day);
        return ld.getDayOfWeek().name();

    }

}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

        int month = scan.nextInt();

        int year = scan.nextInt();

        String res = Result.findDay(day, month, year);

        scan.close();

        System.out.println(res);
    }
}
