package Q11;

import java.util.*;

public class Operation {
	/*
	 * From ArrayLsit of Orders create a map <String,Float> where Menu Name is key
	 * and total sale in a day for theMenu as Value. (sale for the menu is Price*qty
	 * ordered).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Order o1=new Order(80,"Pav Bhajee",120.00f,5);
Order o2=new Order(90,"Grilled Sandwitch",72.00f,10);
Order o3=new Order(92,"HakkaNoodles",220.00f,2);
Order o4=new Order(96,"Pav Bhajee",125.00f,8);
Order o5=new Order(101,"GrilledSandwitch",70.00f,2);
List <Order> al;
		  al=new ArrayList();
		 al.add(o1);
		 al.add(o2);
		 al.add(o3);
		 al.add(o4);
		 al.add(o5);
		 Map<String ,Float>hm=new HashMap();
	Iterator<Order> itr=al.iterator();
	while(itr.hasNext())
	{
		Order temp=itr.next();
		if(hm.containsKey(temp.MenuName))
		{
			hm.put(temp.MenuName,hm.get(temp.MenuName)+(temp.price*temp.qtyOrdered));
		}
		else
		{
			hm.put(temp.MenuName,(temp.price* temp.qtyOrdered));
		}
		
	}
	
System.out.println(hm);
	
	
	}

}
