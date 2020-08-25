package Que4;
import java.util.*;
import java.util.Map.Entry;
public class operation {
	/*
	 * A hashmap contains information about students and his marks. Student object
	 * is key and marks is value. 
	 * Write a method to create 2 hashset which will have
	 * passed students of java course and passed students of angular course. Passing
	 * marks for java is 50 and passing marks for angular is 60. Student class is as
	 * follows. Student { intsid , String name, String course }
	 */
	HashSet<Student> hs1=new HashSet<>();
	HashSet<Student> hs2=new HashSet<>();
	void passStudent(HashMap<Student,Integer> hm)
	{
		Set<Student> s1=hm.keySet();
		
		for(Student s : s1) {
			if(s.getCourse().equals("Java")) {
				int mk = hm.get(s);
				if(mk>=50) {
					hs1.add(s);
				}
			}
			else {
				int mk=hm.get(s);
				if(mk>=60) {
					hs2.add(s);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student(101,"Umesh", "java");
		Student s2=new Student(102,"Himanshu", "java");
		Student s3=new Student(103,"Bhagyshree", "java");
		Student s4=new Student(104,"Pranav", "angular");
		Student s5=new Student(105,"Teju", "angular");
		Student s6=new Student(106,"Vishal", "angular");
		
		HashMap<Student,Integer>hm=new HashMap();
		hm.put(s1,45);
		hm.put(s2,65);
		hm.put(s3,85);
		hm.put(s4,45);
		hm.put(s5,65);
		hm.put(s3,75);

		for(Student stu:hm.keySet()) {
			System.out.println("Student :\n"+stu);
			System.out.println("Marks "+hm.get(stu));
		}
		 operation s=new  operation();
		s. passStudent(hm);
		
		System.out.println("\n\nPassed Student in Java"+s.hs1);
		System.out.println("Passed Student in Angular"+s.hs2);
		  
		}
		
		
		
		

	}


