//Program to reverse a given string

import java.io.*;

class PrgB1 {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*** PROGRAM TO REVERSE A GIVEN STRING *** ");
		System.out.println("Enter a string");
		String s = br.readLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Given string is: " + s);
		System.out.println("Reversed string is: " + sb.reverse());
	}
}