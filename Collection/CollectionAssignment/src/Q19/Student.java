package Q19;

public class Student {
	/*
	 * There is a HashSet which has student objects.
	 *  Create two arraylists from thishashset. 
	 * In one arraylist called ‘placedStudents’ insert all students who
	 * have been placed and in another arraylist ‘unplacedStudents’ 
	 * Student
	 * class--Fields studid, Name, Qualification, yearOfpassing, placed(true/false)
	 */
	int studid;
	String name;
	String Qualification;
	int yearOfpassing;
	String placed ;
	public Student(int studid, String name, String qualification, int yearOfpassing, String placed)
	{
		this.studid = studid;
		this.name = name;
		Qualification = qualification;
		this.yearOfpassing = yearOfpassing;
		this.placed = placed;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", Qualification=" + Qualification + ", yearOfpassing="
				+ yearOfpassing + ", placed=" + placed + "]";
	}
	
	 

}
