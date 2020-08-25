package Q20;

import java.util.*;

public class Operation {
	/*13. Consider List of T20 Players. Player (playerid,Name,Country,team) e.g.
	 * (1,”MSDhoni”,”India”,”Chennai Super Kings”) Then find out which team has
	 * maximum Australian players.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Player p1=new Player(1, " Msd", "India", " Chennai Super Kings");
    Player p2=new Player(2, " Virat", "India", " rcb");
    Player p3=new Player(3, " Rahul", " India", " punjab");
    Player p4=new Player(4, " Ponting", "Australia", " Mumbai");
    Player p5=new Player(5, " andrew", "Australia", " Chennai Super Kings");
    Player p6=new Player(6, "Devid Warner", "Australia", "Sunrise ");
    Player p7=new Player(7, " Finch", "Australia", " Rcb");
    Player p8=new Player(8, " Rohit", " India", " Mumbai Indian");
    Player p9=new Player(9, " pandya", " India", " mumbai Indians");
    Player p10=new Player(10, " raina", "Australia", " Chennai Super Kings");
    Set <Player> s=new HashSet();
    s.add(p1);
    s.add(p2);
    s.add(p3);
    s.add(p4);
    s.add(p5);
    s.add(p6);
    s.add(p7);
    s.add(p8);
    s.add(p9);
    s.add(p10);
    Iterator<Player> itr=s.iterator();
    int max=0,count=0;;
    //String maxTeam=null;
    Map<String ,Integer> hm= new HashMap();
   String name=" ";
    while(itr.hasNext())
    {
    	Player temp= itr.next();
    	String team=temp.team;
    	count=0;
    	  for(  Player obj: s)
    	  {
    		  if( team== obj.team)
    		  {
    			 if( obj.Country=="Australia")
    			 {
    				 count++;
    				
    				
    			 }
    		  }
    	  }
    	  if( max< count)
			 {
    		  //System.out.println(count);
    		  max=count;
			name=temp.team;
			 }
    	  
    	
    }
    System.out.println(" Team Having Highest no of Australia Player :" +name);
	}

}
