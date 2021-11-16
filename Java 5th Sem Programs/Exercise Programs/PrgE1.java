//Program to display a half pyramid

import java.io.*;

class PrgE1 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, j, n;
		System.out.println("Enter the size of the half pyramid");	
		n = Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}