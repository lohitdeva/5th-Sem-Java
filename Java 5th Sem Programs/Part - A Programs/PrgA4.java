//Program to demonstrate string operations
import java.io.*;
class PrgA4 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first, second;
		System.out.println("*** PROGRAM TO IMPLEMENT STRING OPERATIONS ***");
		System.out.println("Enter the two strings");
		first = br.readLine();
		second = br.readLine();
		System.out.println("The given strings are \"" + first + "\" and \"" + second + "\"");
		System.out.println("The length of the first string is " + first.length());
		System.out.println("The length of the second string is " + second.length());
		System.out.println("The concatenation of the first and second strings are " + first.concat(second));
		System.out.println("The first character of the first string is " + first.charAt(0));
		System.out.println("The uppercase of the first string is " + first.toUpperCase());
		System.out.println("The lowercase of the second string is " + second.toLowerCase());
		System.out.println("Replacing 'a' with 'o' in the first string gives " + first.replace('a','o'));
		System.out.println("The substring of \"" + first + "\" starting from index 2 to 5 is " + first.substring(2,5));
		System.out.println("Enter character whose occurence has to be checked in \"" + first + "\": ");
		char ch = (char)System.in.read();
		if (first.indexOf(ch) == -1)
			System.out.println("The character " + ch + " does not occur anywhere in the first string");
		else 
			System.out.println("The character " + ch + " occurs at position " + first.indexOf(ch) + " in the first string");
		boolean check = first.equals(second);
		if (check) 
			System.out.println("Both strings are equal");
		else
			System.out.println("Both strings are not equal");
	}
}