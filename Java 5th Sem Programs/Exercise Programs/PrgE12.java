//Program to demonstrate compile-time polymorphism (method overloading)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrgE12 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("*** PROGRAM TO DEMONSTRATE COMPILE-TIME POLYMORPHISM ***");

		System.out.println("\nMENU DRIVEN PROGRAM:");
		System.out.println("1. Count number of digits in a number");
		System.out.println("2. Count number of words in a string");
		int choice = Integer.parseInt(br.readLine());

		switch(choice) {

			case 1:
				System.out.println("\nEnter the number:");
				int num = Integer.parseInt(br.readLine());
				System.out.println("\nThe number of digits in " + num + " is " + count(num));
				break;
		
			case 2:
				System.out.println("\nEnter the string:");
				String s = br.readLine();
				String s1 = s.trim();
				System.out.println("\nThe number of words in the string \"" + s + "\" is " + count(s1));
				break;

			default:
				System.out.println("\nInvalid Option");

		}
		
	}

	static int count(int x) {
		
		int digits = 0;
		
		while(x > 0) {
			digits++;
			x /= 10;
		}
		
		return digits;

	}

	static int count(String s) {
	
		int words = 0;
		
		for(int i = 0; i < s.length(); i++) 
			if(s.charAt(i) == ' ' && s.charAt(i-1) != ' ')
				words++;

		return words + 1;	

	}

}

