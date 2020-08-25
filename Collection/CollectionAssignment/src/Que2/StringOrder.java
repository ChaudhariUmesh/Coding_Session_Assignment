package Que2;
import java.util.*;
import java.util.Map.Entry;
public class StringOrder {
	/*
	 * Given a Linkedhashmap<string, integer> , find out if given list of keys
	 * (Strings )appear in same order in hashmap. E.g. Linkedhashmap has { “pqr” ,
	 * 12 } { “rst” , 43 } { “abc” , 4 } { “mno” ,2} Given list is (“rst”) (“abc”)
	 * so it appears in same order. Output should be “true” If given list is (“abc”
	 * ) (“pqr” ) then output should be “false”
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap();
		lhm.put("pqr", 12);
		lhm.put("rst", 43);
		lhm.put("abc",4);
		lhm.put("mno", 2);
		System.out.println(lhm);
		System.out.println("______________________________");
		sc=new Scanner(System.in);
		System.out.println("Enter the String1");
		String st1=sc.next();
		System.out.println("Enter the String2");
		String st2=sc.next();
		Set s=lhm.entrySet();
		LinkedList l=new LinkedList(s);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			
			if(l.get(i) != null && l.get(i)==st1 )
			{
				System.out.println("******");
			}
			   /*if(	l.get(i+1)==st2)
			   {
				   System.out.println("true");
				   break;
			   }
			   else
				   System.out.println("False");
			   break;
			}*/
		}
		
	}

}
