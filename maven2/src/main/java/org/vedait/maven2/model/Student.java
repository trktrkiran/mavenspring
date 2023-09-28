package org.vedait.maven2.model;

public class Student {

	private int rollNumber;
	private String name;
	private String schoolName;
	
	public Student() {
		
	System.out.println("Student constructor is called");
	
	}

	public Student(int rollNumber, String name, String schoolName) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.schoolName = schoolName;
	}

	public void getDetails() {
		System.out.println("get details method...");

	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", schoolName=" + schoolName + "]";
	}

}
