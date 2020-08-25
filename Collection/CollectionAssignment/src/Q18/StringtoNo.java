package Q18;

import java.util.ArrayList;
import java.util.Scanner;

public class StringtoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList< String> al=new ArrayList();
	      al.add("A+2");
	      al.add("B+12");
	      al.add( "D+4");
	      al.add("DD+5");
	       System.out.println(al);
	      System.out.println(" Enter the Character");
	      char c=sc.next().charAt(0);
	      char no=' ';
	      for( int i=0;i<al.size();i++)
	       {
	    	   String s=al.get(i);
	    	   for( int j=0;j<s.length();j++)
	    	   {
	    		   char cc= s.charAt(j);
	    		   if( cc==c)
	    		   {   
	    			  
	    			   for( int k=0;k< s.length();k++)
	    			   {
	    			   if(cc>=48 && c<=57)
	    		        {
	    				  no=(char) s.charAt(k);
	    		        }
	    			   }
	    		   }
	    	   }
	       }   
	    		   
	    	System.out.println(no);		
	      
	}

}
