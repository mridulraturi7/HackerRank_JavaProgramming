package javaPriorityQueue;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class StudentModel
{
    private int id;
    private String name;
    private double cgpa;

    public StudentModel(int id, String name, double cgpa)
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

class StudentComparator implements Comparator<StudentModel>
{
    @Override
    public int compare(StudentModel a, StudentModel b)
    {
        double cg1 = a.getCGPA();
        int i1 = a.getId();
        String nam1 = a.getName();
        double cg2 = b.getCGPA();
        int i2 = b.getId();
        String nam2 = b.getName();
            
        int cgCompare = Double.compare(cg2,cg1);

        if(cgCompare == 0)
        {
            if(nam1.compareTo(nam2) == 0)
            {
                return Integer.compare(i1,i2);
            }

            else
            {
                return nam1.compareTo(nam2);
            }
        }

        else
        {
            return cgCompare;
        }
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