package Que7;

import java.util.Comparator;

public class RatingComaprator implements Comparator<Theatre> {

	@Override
	public int compare(Theatre o1, Theatre o2) {
		// TODO Auto-generated method stub
		if(o1.m.rating> o2.m.rating)
			return -1;
			else if( o1.m.rating< o2.m.rating)
				return 1;
				else
				 return o1.tname.compareTo(o2.tname);
		
	}

}
