package Que8;
import java.util.*;
public class Student {
	/*
	 * Consider an array of Student Student (int sid, String sname, List<String>
	 * hobby) From this list create a Map<String,List<Student>> where key is hobby
	 * name and list of student objects having same hobby. Also find out most common
	 * hobby among students
	 */
	int sid;
	String sname;
	List l;
	public Student(int sid, String sname, List l) {
		this.sid = sid;
		this.sname = sname;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", l=" + l + "]";
	}
	
	
	
}
