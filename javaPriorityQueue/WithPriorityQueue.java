package javaPriorityQueue;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Student
{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId()
    {
        return id;
    } 

    public String getName()
    {
        return name;
    }

    public double getCGPA()
    {
        return cgpa;
    }
}

public class WithPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
    
}