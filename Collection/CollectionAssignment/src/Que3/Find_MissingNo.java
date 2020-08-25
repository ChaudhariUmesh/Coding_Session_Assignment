package Que3;
import java.util.*;
public class Find_MissingNo {
	/*
	 * Given a linked list of integers , find out number of missing elements in
	 * linked list. 
	 * E.g. list contains { 2 , 3, 7} missing elements are 4, 5, 6. 
	 * If list contains { 3 , 13 , 7 , 2 } . missing elements are 4,5,6,8,9,10,11,12
	 * and so on. Write a logic which will work for any list.
	 */
	public static void main(String[] args) {
		Integer [] a= {10,5,6,2,8,13,18};
		LinkedList<Integer>lnk=new LinkedList(Arrays.asList(a));
			System.out.println(lnk);
			Collections.sort(lnk);
			System.out.println(lnk);
			int  last=lnk.peekLast();
			int first=lnk.getFirst();
			System.out.println("missing element are : ");
			for(int i=first;i<last;i++)
			{
				if(lnk.contains(i)==false)
				{
					
					System.out.print(i+" ");
				}
			}
			
	}

}
