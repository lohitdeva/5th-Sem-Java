//Program to display Fibonacci series using while loop

import java.io.*;

class PrgE2 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 1, n, i = 1, fib;
		System.out.println("Enter the number of terms of Fibonacci series:");
		n = Integer.parseInt(br.readLine());
		if (n <= 0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		System.out.println("The terms of the Fibonacci series are: ");
		while (i <= n) {
			if (i == 1)
				System.out.print(a + " ");
			else if (i == 2)
				System.out.print(b + " ");
			else {
				fib = a + b;
				System.out.print(fib + " ");
				a = b;
				b = fib;
			}
			i++;
		}
	}
}