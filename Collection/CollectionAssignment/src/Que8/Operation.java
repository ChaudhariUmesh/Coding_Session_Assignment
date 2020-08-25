package Que8;
import java.util.*;
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		   
		   ArrayList<String > al1=new ArrayList<>();
			al1.add("Singing");
			al1.add("Coding");
			
			ArrayList<String > al2=new ArrayList<>();
			al2.add("Dancing");
			al2.add("Coding");
			al2.add("Playing");
			
			ArrayList<String > al3=new ArrayList<>();
			al3.add("Playng");
			al3.add("Swimming");
			al3.add("Dancing");
			
			 List< String > hobbies=new ArrayList();
			   hobbies.add(" dancing");
			   hobbies.add("coding");
			
			Student s1=new Student(1,"Umesh",al1);
			Student s2=new Student(1,"Himanshu",al2);
			Student s3=new Student(1,"Bhagyshree",al3);
			Student s4=new Student(1,"Vaibhav",hobbies);
			
			ArrayList<Student> slist=new ArrayList<>();
			slist.add(s1);
			slist.add(s2);
			slist.add(s3);
			slist.add(s4);
			
			for(Student obj:slist)
			{
				System.out.println(obj);
			}
			
			HashMap<String, List<Student>> hm=new HashMap<>();
			
			for(Student obj: slist) 
			{
				
				List<String> l1=obj.l;
				
				for(String str:l1) {
					
					if(hm.containsKey(str)) {
						List<Student> list=hm.get(str);
						list.add(obj);
						hm.put(str, list);
					}
					else
					{
						ArrayList<Student> list=new ArrayList<>();
						list.add(obj);
						hm.put(str, list);
					}
				}
			}
			
			for(String s:hm.keySet()) {
				System.out.println("Hobby \n"+s);
				for(Student temp: hm.get(s)) {
					System.out.println(temp);
				}
				
			}
	}

}
