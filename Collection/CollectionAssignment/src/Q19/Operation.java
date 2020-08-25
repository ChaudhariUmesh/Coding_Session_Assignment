package Q19;

import java.util.*;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student s1=new Student(101, " Umesh", " Engineer", 2019, "placed");
   Student s2=new Student(102, " Himanshu", " Engineer", 2016, "Unplaced");
   Student s3=new Student(103, " Vaibhav", " Engineer", 2017, "placed");
   Student s4=new Student(104, " Shubham", " Engineer", 2019, "placed");
   Student s5=new Student(105, " Bhagyshree", " Engineer", 2015, "Unplaced");
   Student s6=new Student(106, " sopan", " Engineer", 2017, "placed");
   ArrayList<Student> placedStudent=new ArrayList();
   ArrayList<Student> unplacedStudent=new ArrayList();
     Set<Student> s=new HashSet();
     s.add(s1);
     s.add(s2);
     s.add(s3);
     s.add(s4);
     s.add(s5);
     s.add(s6);
     
     Iterator< Student> itr=s.iterator();
     while(itr.hasNext())
     {
    	  Student temp=itr.next();
    	  if( temp.placed=="placed")
    	  {
    		  placedStudent.add(temp);
    	  }
    	  else
    	  {
    		  unplacedStudent.add(temp);
    	  }
    	  
     }
     System.out.println("placed Student : ");
     System.out.println(placedStudent);
     System.out.println("____________________________");
     System.out.println("Unplaced Student : ");
     System.out.println(unplacedStudent);
	}

}
