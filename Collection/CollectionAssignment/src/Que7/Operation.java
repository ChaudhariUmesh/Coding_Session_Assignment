package Que7;

import java.util.*;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie m1=new Movie(101, " 3idit", 4);
		Movie m2=new Movie(102, " Dil Bechara", 3);
		Movie m3=new Movie(103, " Pareeksha", 5);
		Movie m4=new Movie(104, " FinalTest", 4);	
		Movie m5=new Movie(105, " Angrezi Medium", 2);
		
		 Theatre t1=new Theatre(1001, " bigBazzar", "Hinjewadi ", m1);
		 Theatre t2=new Theatre(1002, " citypride", "Akurdi ", m3);
		 Theatre t3=new Theatre(1003," Ganesh", "nigdi ", m5);
		 Theatre t4=new Theatre(1004, " inox", "shivajinagar ", m1);
		 Theatre t5=new Theatre(1005, " vishal", "Pashan ", m2);
		 Theatre t6=new Theatre(1006, " E square", "baner ", m4);
		 Theatre t7=new Theatre(1007, " Carnival", "Pune", m5);
		 
		 List <Theatre> l=new ArrayList();
		 l.add(t1);
		 l.add(t2);
		 l.add(t3);
		 l.add(t4);
		 l.add(t5);
		 l.add(t6);
		 l.add(t7);
		 Collections.sort( l,new RatingComaprator());
		 for( int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i));
			 System.out.println("_____________________");
		 }
	}

}
