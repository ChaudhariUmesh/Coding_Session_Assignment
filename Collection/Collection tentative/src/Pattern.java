import java.util.Scanner;

public class Pattern {
 public static void main( String []a)
 {
	 Scanner sc = new Scanner(System.in);
	    System.out.println("Enter  the No of rows");
	    int no = sc.nextInt();
	    int s = no;
int j;
	    for (int i= 1; i <= no * 2 - 1; i=i+2)
	    {
	    	
	      for (int k = 1; k < s; k++)
	        System.out.print("_");
	      
	      for ( j = 1; j<= i; j++)
	        System.out.print("*");
	      
	      int jj=j;
	      if(jj!=no*2) {
	    	  System.out.print("_");
	      }
	      System.out.println();
	      s--;
	    } 

 }
}
