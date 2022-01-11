//Program to implement an interface called Info

import java.io.*;

interface Info {

	String name = "Lohit";
	int age = 23;
	String subject = "Mathematics";
	int marks = 90;

	void checkPass();

}

class Student implements Info {
	
	void display() {
	
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Subject: " + subject);
		System.out.println("Marks: " + marks);
	
	}
	
	public void checkPass() {
		if (marks >= 35)
			System.out.println("\n" + name + " has passed in " + subject);
		else
			System.out.println("\n" + name + " has failed in " + subject);
	}

}

class PrgE6 {
	
	public static void main(String[] args){

		Student s = new Student();
	
		s.display(); 	
		s.checkPass();

	}

}
