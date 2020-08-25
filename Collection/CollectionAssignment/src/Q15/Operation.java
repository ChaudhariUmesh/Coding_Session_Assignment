package Q15;

import java.util.*;
import java.util.Map.Entry;

public class Operation {

	public static void main(String[] args) {
		SocietyMember s1=new SocietyMember(101, 1, "guptafamily");
		SocietyMember s2=new SocietyMember(102, 2, "chavanfamily");
		SocietyMember s3=new SocietyMember(103, 3, "naikfamily");
		SocietyMember s4=new SocietyMember(104, 4, "patilfamily");
		SocietyMember s5=new SocietyMember(105, 5, "gaylifamily");
		SocietyMember s6=new SocietyMember(106, 6, " ahire family");
		SocietyMember s7=new SocietyMember(107, 1, " ahire family");
		SocietyMember s8=new SocietyMember(108, 2, " ahire family");
		SocietyMember s9=new SocietyMember(109, 3, " ahire family");
		SocietyMember s10=new SocietyMember(110, 1, " ahire family");
		
		 List< SocietyMember> al=new ArrayList();
		 al.add(s1);
		 al.add(s2);
		 al.add(s3);
		 al.add(s4);
		 al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);
		
	
		 
		 Map< Integer,ArrayList<String> > hm=new HashMap();
		 
		 Iterator < SocietyMember> itr=al.iterator();
		 ArrayList <String >all;
		 while( itr.hasNext())
		 {
			 SocietyMember temp=itr.next();
			 int no=temp.Wing_flatNo;
			 String string=temp.name;
			 if( hm.containsKey(no))
			 {
				 ArrayList<String> a=hm.get(no);
				 a.add(string);
			 }
			 else
			 {
				 all=new ArrayList();
				 all.add(string);
				 hm.put(no,all);
			 }
			 
			
			 
		 }
		
		 
		 
		System.out.println(hm);

	}

}
