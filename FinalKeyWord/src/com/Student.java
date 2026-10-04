package com;

public class Student {
	
	int studentId;
	String name;
	String branch;
	final static String collegeName = "FLM";//u cannot change value for college name (static aythe okati change chesina motham update aytadhi)
	
    public Student(int studentId, String name, String branch) {
    	super();
    	this.studentId = studentId;
    	this.name = name;
    	this.branch = branch;
    	
    	//collegename cannot put in parameter because its final if its static we can put
    }

}
