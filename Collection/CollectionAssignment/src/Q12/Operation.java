package Q12;

import java.util.*;
import java.util.Map.Entry;

public class Operation {

	/*
	 * Create a Map<String,String> where key is adharno and value is voted casted to
	 * which party(eg. BJP,ShivSena,NCP,Congress,Other) .From this create new map
	 * such that KEY is party name and value is count of votes caste..
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String>votingrecord=new HashMap();
votingrecord.put("123456789123", "BJP");
votingrecord.put("123456789124", "ShivSena");
votingrecord.put("123456789125", "BJP");
votingrecord.put("123456789126", "NCP");
votingrecord.put("123456789127", "COngress");
votingrecord.put("123456789128", "Other");
votingrecord.put("123456789129", "ShivSena");
votingrecord.put("123456789130", "ShivSena");
votingrecord.put("123456789131", "NCP");
Map<String,Integer> hm=new HashMap();
Set s=votingrecord.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Entry temp=(Entry) itr.next();
	  if(hm.containsKey((String)temp.getValue()))
	  {
		 hm.put((String)temp.getValue(),hm.get((String) temp.getValue())+1);
	  }
	  else
	  {
		hm.put((String) temp.getValue(),1);  
	  }
}

System.out.println(hm
		);
	}

}
