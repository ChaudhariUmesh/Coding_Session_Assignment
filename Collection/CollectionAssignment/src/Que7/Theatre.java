package Que7;

public class Theatre  {
	/*
	 * Create a collection to maintain data in sorted order of Movie Rating and if 2
	 * movies have same rating then according to Theatrename (use Anonymous class
	 * for sorting) Theatre (Theatreid,Theatrename,location,Movie) Movie
	 * 	
	 */
	 int theatreid;
	 String tname;
	 String location;
	 Movie m;
	public Theatre(int theatreid, String tname, String location, Movie m) {
		super();
		this.theatreid = theatreid;
		this.tname = tname;
		this.location = location;
		this.m = m;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((m == null) ? 0 : m.hashCode());
		result = prime * result + theatreid;
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatre other = (Theatre) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		if (theatreid != other.theatreid)
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", tname=" + tname + ", location=" + location + ", m=" + m + "]";
	}
	
	
	
	 
}
