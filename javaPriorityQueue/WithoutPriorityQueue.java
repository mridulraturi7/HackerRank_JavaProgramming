package javaPriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/*
This solution is implemented using only ArrayList and comparator. Priority Queue is not used here.
Check the next solution for Priority Queue.
*/

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

class Priorities
{
    List<Student> students = new ArrayList<>();

    Comparator<Student> myComparator = new Comparator<Student>(){
        public int compare(Student a, Student b)
        {
            double cg1 = a.getCGPA();
            int i1 = a.getId();
            String nam1 = a.getName();
            double cg2 = b.getCGPA();
            int i2 = b.getId();
            String nam2 = b.getName();
            
            int cgCompare = Double.compare(cg1,cg2);

            if(cgCompare == 0)
            {
                if(nam2.compareTo(nam1) == 0)
                {
                    return Integer.compare(i2,i1);
                }

                else
                {
                    return nam2.compareTo(nam1);
                }
            }

            else
            {
                return cgCompare;
            }
        }
    };

    public List<Student> getStudents(List<String> events)
    {
        for(String str : events)
        {
            String[] array = str.split(" ");
            if(array[0].equals("ENTER"))
            {
                Student std = new Student(Integer.parseInt(array[3]), array[1], Double.parseDouble(array[2]));
                students.add(std);
            }

            else if(array[0].equals("SERVED"))
            {
                if(!students.isEmpty())
                {
                    Collections.sort(students, myComparator);
                    students.remove(students.size()-1);
                }
            }
        }

        Collections.reverse(students);
        return students;
    }

}

public class WithoutPriorityQueue {
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