package Q15;

public class SocietyMember {

	/*
	 * Assume that there is already arraylist of members of Society
	 * Member{memberid,Wing_flatNo,name}.
	 *  Write a program which creates Map where
	 * key is Wing_FlatNo and value is List of all names of family members
	 */
	 int memberid;
	  int Wing_flatNo;
	   String name;
	public SocietyMember(int memberid, int wing_flatNo, String name) 
	{
		this.memberid = memberid;
		Wing_flatNo = wing_flatNo;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Wing_flatNo;
		result = prime * result + memberid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		SocietyMember other = (SocietyMember) obj;
		if (Wing_flatNo != other.Wing_flatNo)
			return false;
		if (memberid != other.memberid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SocietyMember [memberid=" + memberid + ", Wing_flatNo=" + Wing_flatNo + ", name=" + name + "]";
	}
	
	   
}
