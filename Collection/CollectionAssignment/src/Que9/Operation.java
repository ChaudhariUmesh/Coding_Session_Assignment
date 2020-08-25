package Que9;
import java.util.*;
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager(1,"vaibhav");
		Manager m2=new Manager(2,"chirag");
		
  Employee e1=new Employee( " vaibhav", 101,0);
  Employee e2=new Employee(" bhagyshree",102,1);
  Employee e3=new Employee(" Shubham",103,2);
  Employee e4=new Employee(" HImanshu",104,1);
  Employee e5=new Employee(" Ahire",105,1);
  Employee e6=new Employee(" chirag",106,0);
  List<Manager> mgr=new ArrayList();
  mgr.add(m1);
  mgr.add(m2);
  
  List <Employee> emp=new ArrayList();
  
  emp.add(e1);
  emp.add(e2);
  emp.add(e3);
  emp.add(e4);
  emp.add(e5);
  emp.add(e6);
     Iterator< Employee> itr=emp.iterator();
     String name =null;
     while(itr.hasNext())
     {
    	 Employee temp=itr.next();
    	 int  id=temp.mgrid;
    	
    	for( Manager obj:mgr) 
    	{
    	  if(id !=0)
    	  {
    		if(obj.id==id)
    		{
    			name=obj.name;
    			System.out.println(  temp+" "+ " manager name :"+ name);
    		}
    	  }
    	  else
    	  {
    		  System.out.println(temp);
    	  }
    	  
    	}
    	
     }
  
  
	}

}
