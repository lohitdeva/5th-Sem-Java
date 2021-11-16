//Program to display the factors of a given number

import java.io.*;

class PrgE7 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number whose factors are to be determined");
		int num = Integer.parseInt(br.readLine());
		System.out.println("The factors of " + num + " are: ");
		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				System.out.print(i + " ");
	}
}
		