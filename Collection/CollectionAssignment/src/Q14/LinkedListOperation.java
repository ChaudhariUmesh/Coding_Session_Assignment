package Q14;

import java.util.*;

public class LinkedListOperation {
	/*
	 * Given two LinkedList, we need to combine two LinkedList in such a way that
	 * the combined aList has alternate elements of both. If one list has extra
	 * element, then these elements are appended at the end of the combined list.
	 * 
	 * Input : list1 = {1, 2, 3, 4, 5, 6} 
	 * List2 = {11, 22, 33, 44} List3: {1, 11, 2,
	 * 22, 3, 33, 4, 44, 5, 6}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer>list1=new LinkedList();
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
     list1.add(5);
     list1.add(6);
     LinkedList<Integer>list2=new LinkedList();
     list1.add(11);
     list1.add(22);
     list1.add(33);
     list1.add(44);
     list1.add(55);
     list1.add(66);
     list1.add(77);
     LinkedList<Integer>list3=new LinkedList();
     int count=0,count2=0;
     int size=(list1.size()+list2.size());
     System.out.println(size);
     for(int i=0;i<size;i++)
		{ 
			
			if(i%2==0)	
			{ 
				if(	count<list1.size()-1)
				{
				int no=list1.get(count);
				list3.add(no);
				count++;
				}
				else
				{ 
				if(count2<list2.size()-1)
				{
					int no=list2.get(count2);
					list3.add(no);
					count2++;
				}
				}
			}
		
			else{
					if(count2<list2.size())
					{
							int no=list2.get(count2);
							list3.add(no);
							count2++;
					}
			  else{
					int no=list1.get(count);
					list3.add(no);
					count++;
				 }
			
			}
		}
		System.out.println(list3);
		}
}
		
	
      