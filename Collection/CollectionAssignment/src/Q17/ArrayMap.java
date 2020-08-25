import java.util.*;

public class ArrayMap {
	/*
	 * An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
	 * map which has alphabets as keys and integers as values. If alphabet is
	 * repeated add integer to old value
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList< String> al=new ArrayList();
      al.add("A+2");
      al.add("B+12");
      al.add( "D+4");
      al.add("DD+5");
       Map< Character,Integer> hm=new HashMap();
		/*
		 * Iterator <String> itr=al.iterator(); while( itr.hasNext()) { Stir }
		 */
       for( int i=0;i<al.size();i++)
       {
    	   String s=al.get(i);
    	   for( int j=0;j<s.length();j++)
    	   {
    		   char c= s.charAt(j);
    		   if(c>=65 && c<=122)
    		   {
    		     if(hm.containsKey(c))
    		     {
    			   hm.put(c,hm.get(c)+1);
    		     }
    		     else
    		      {
    			   hm.put(c,1);
    		      }
    		   }
    	   }
       }
       System.out.println(hm);
	}

}
