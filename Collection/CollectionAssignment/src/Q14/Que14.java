package Q14;

import java.util.LinkedList;

public class Que14 {
	public static void main(String[]agrs)
	{
		
		LinkedList <Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		System.out.println(ll);
		
		LinkedList <Integer> ll1=new LinkedList<>();
		ll1.add(11);
		ll1.add(22);
		ll1.add(33);
		ll1.add(44);
		
		System.out.println(ll1);
		
		LinkedList <Integer> ll2=new LinkedList<>();
		int counter=0;
		int counter1=0;
		for(int i=0;i<10;i++)
		{ 
			
			if(i%2==0)	
			{ 
				if(	counter<ll.size()-1)
				{
				int no=ll.get(counter);
				ll2.add(no);
				counter++;
				}
				else
				{ 
				if(counter1<ll1.size()-1)
				{
					int no=ll1.get(counter1);
					ll2.add(no);
					counter1++;
				}
				}
			}
		
			else{
					if(counter1<ll1.size())
					{
							int no=ll1.get(counter1);
							ll2.add(no);
							counter1++;
					}
			else{
					int no=ll.get(counter);
					ll2.add(no);
					counter++;
				}
			
			}
		}
		System.out.println(ll2);
		}
		
	
}
