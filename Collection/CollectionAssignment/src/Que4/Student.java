package Que4;

public class Student {
	
	int sid;
	String name;
	String course;
	Student (int sid , String name, String course )
	{
		this.sid=sid;
		this.name=name;
		this.course=course;

	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
