package Que5;
import java.util.*;
public class operation {

	public static void main(String[] args) {
		String []a= { "popcorn","burger","pizza","memos"};
		String []b= { "popcorn","burger","pizza"};
		String []c= { "burger","memos"};
		String []d= { "popcorn","memos"};
		String []e= { "Kachori","samosa","pizza","bhel"};
		
		Customer obj1=new Customer(101, " Shrinivas",a );
		Customer obj2=new Customer(102, " HIMALAYA",b);
		Customer obj3=new Customer(103, " POPATBHEL",c);
		Customer obj4=new Customer(104, " CHATCENTER",d );
		Customer obj5=new Customer(105, " PAVBHAJI",e);
		

		ArrayList <Customer> customerList=new ArrayList();
		customerList.add(obj1);
		customerList.add(obj2);
		customerList.add(obj3);
		customerList.add(obj4);
		customerList.add(obj5);
		customerList.add(obj2);
		customerList.add(obj4);
		
		System.out.println( customerList);
		System.out.println("______________________");
		Set <Customer> customerset=new HashSet();
		for( int i=0;i<customerList.size();i++)
		{
			
			if(customerset.contains(customerList.get(i)))
			{
				String[] obj=customerList.get(i).Items; Iterator itr=customerset.iterator();
				 for( int  j=0;j<i;j++)
				 {
					 if(customerList.get(j).equals(customerList.get(i)))
					 {
						 String[]as=customerList.get(j).Items; 
						 for( int i=0;i<)
					 }
				 }
			
			}
			else 
			{
				
				customerset.add(customerList.get(i));
			}
		}
		System.out.println("______________________________________set");
		System.out.println(customerset);
		
	}

}
