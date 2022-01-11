//Program to demonstrate all the uses of the super keyword

import java.io.*;

//This class is made abstract as it not necessary to access this class anywhere directly
abstract class StudentDetails {

    private String name;
    private int age;
    boolean pass;

    StudentDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

    	//The toString() method is a built-in method that represents the object as a String. Here we are overriding it so that it displays the details that we desire.
	public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }

}

class Marks extends StudentDetails{

    private String subject;
    private int marks;

    Marks(String name, int age, String subject, int marks){

	//Here the super keyword is used to call the constructor of the parent class
        super(name, age);
        this.subject = subject;
        this.marks = marks;

    }

    public String toString() {

	//Here the super keyword is used to call the toString method of the parent class
        return super.toString() + "\nSubject: " + subject + "\nMarks: " + marks;

    }

    public boolean checkPass() {

	//Here the super keyword is used to access the pass variable of the parent class
        if (marks >= 35)
            super.pass = true;
        else
            super.pass = false;
        return super.pass;

    }

}

public class PrgE17 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of the student: ");
        String name = br.readLine();
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter the subject: ");
        String subject = br.readLine();
        System.out.print("Enter the marks: ");
        int marks = Integer.parseInt(br.readLine());

        Marks m = new Marks(name, age, subject, marks);

        System.out.println("\nThe student details are:");

	//Note that here we are directly calling the object in the println method. This will display whatever we defined in the overridden toString() method
        System.out.println(m + "\n");

        boolean pass = m.checkPass();

        if (pass)
            System.out.println(name + " has passed in " + subject);
        else
            System.out.println(name + " has failed in " + subject);

    }

}
