package Q13;

import java.util.*;

public class Operation {

	/*
	 * Create two Set of students objects where insertion order in maintained. Now
	 * accept Studentid from user and check whether in both sets have student with
	 * given id at same position
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
    Student s1=new Student(101," Rohan"); 
    Student s2=new Student(102," Khushal"); 
    Student s3=new Student(103," Pranav"); 
    Student s4=new Student(104," Omkar"); 
    Student s5=new Student(105," Sonali"); 
    Student s6=new Student(106," Aaisha"); 
    Set <Student> set1=new LinkedHashSet();
    set1.add(s1);
    set1.add(s2);
    set1.add(s3);
    set1.add(s4);
    set1.add(s5);
    set1.add(s6);
    System.out.println("set1 : ");
       System.out.println(set1);
    Set <Student> set2=new LinkedHashSet();
    set2.add(s1);
    set2.add(s4);
    set2.add(s3);
    set2.add(s2);
    set2.add(s5);
    set2.add(s6);
    System.out.println(" set2 ");
     System.out.println( set2);
    
    System.out.println(" Enter the Student id");
    int id= sc.nextInt();
    int counter=0,count=0;
    boolean flag=false;
    Iterator< Student> itr=set1.iterator();
    while( itr.hasNext())
    {
    	 Student temp=itr.next();
    	int no=temp.sid;
    	counter++;
    if(no==id)
    {
    	flag=true;
    	for( Student obj: set2)
    	{
    		count++;
    		if( counter==count)
    		{
    			int sid=obj.sid;
    			if(no==sid)
    			{
    				System.out.println(" id found  : position :"+counter);
    				break;
    			}
    			else
    			{
    				System.out.println(" data not match with set 2");
    				break;
    			}
    		}
    	}
    	
    }
	   
  }
    if( flag==false)
    {
    	System.out.println(" no not found");
    }
	}
}
