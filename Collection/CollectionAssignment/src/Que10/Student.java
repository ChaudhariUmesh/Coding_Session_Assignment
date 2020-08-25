package Que10;

import java.util.List;

public class Student {
	/*
	 * An map contains student object as a key and list of courses he has enrolled
	 * in. [1M] e.g. map<student , list(course)> Create another map in which course
	 * id is a key and list of student objects of that
	 */
 int id;
 String name;
 List c;
public Student(int id, String name, List c) {

	this.id = id;
	this.name = name;
	this.c = c;
}
 
 
}
