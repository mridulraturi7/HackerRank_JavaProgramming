package javaSort;

import java.util.*;

class Student
{
  private int id;
  private String fname;
  private double cgpa;
  
  public Student(int id, String fname, double cgpa) 
  {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }
    
  public int getId() 
  {
    return id;
  }
    
  public String getFname()
  {
    return fname;
  }
    
  public double getCgpa()
  {
    return cgpa;
  }
}

public class SortExample
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    
    List<Student> studentList = new ArrayList<Student>();
    
    while(testCases>0)
    {
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();
      
      Student st = new Student(id, fname, cgpa);
      
      studentList.add(st);
      
      testCases--;
    }
    
    in.close();
    
    Comparator<Student> myComparator = new Comparator<Student>()
    {
      public int compare(Student a, Student b)
      {
        double g1 = a.getCgpa();
        double g2 = b.getCgpa();
        
        int gCompare = Double.compare(g2, g1);
        
        if(gCompare == 0)
        {
          int nCompare = a.getFname().compareTo(b.getFname());
          
          if(nCompare == 0)
          {
            return Integer.compare(a.getId(), b.getId());
          }
          
          else
          {
            return nCompare;
          }
        }
        
        else
        {
          return gCompare;
        }
      }
    };
    
    Collections.sort(studentList, myComparator);
    
    for(Student st: studentList)
    {
      System.out.println(st.getFname());
    }
	}
}