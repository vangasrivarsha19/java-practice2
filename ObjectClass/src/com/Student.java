package com;

import java.util.Objects;

public class Student {
	
	int id;
	String name;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	String getName() {
		return this.name;
		}
	
	
	public boolean equals(Object obj) {
		Student student = (Student) obj;//explicit type casting converting obj type to student type
		
		boolean output = (this.id == student.id) && //== because it is comparing numbers
		(this.name.equals(student.name)); //.equals because it is comparing strings
		
		return output;
	}
	
	public int hashCode() {
		return Objects.hash(this.id,this.name);
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	


}