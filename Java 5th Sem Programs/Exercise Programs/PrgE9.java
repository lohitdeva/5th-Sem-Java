/* 	Program to assign and print roll number, phone number and address of two students
	having names "Sam" and "John" by creating two objects of a class	*/

import java.io.*;

class Student {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	int roll_number;
	long phone_number;
	String address;
	
	Student (String s) {
		name = s;
	}
	
	void assign() throws IOException{
		System.out.println("Enter roll number");
		roll_number = Integer.parseInt(br.readLine());
		System.out.println("Enter phone number");
		phone_number = Long.parseLong(br.readLine());
		System.out.println("Enter address");
		address = br.readLine();
	}
	
	void disp(){
		System.out.println("Name: " + name);
		System.out.println("Roll number: " + roll_number);
		System.out.println("Phone number: " + phone_number);
		System.out.println("Address: " + address);
	}
}

class PrgE9 {
	public static void main(String args[]) throws IOException{
		Student s1 = new Student("Sam");
		System.out.println("Entering details for Sam");
		s1.assign();
		Student s2 = new Student("John");
		System.out.println("\nEntering details for John");
		s2.assign();
		System.out.println("\nDetails of student 1: ");
		s1.disp();
		System.out.println("\nDetails of student 2:");
		s2.disp();
	}
}