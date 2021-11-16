//Program to multiply two matrices

import java.io.*;

class PrgE4 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows and columns of the first matrix");
		int r1 = Integer.parseInt(br.readLine());
		int c1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the rows and columns of the second matrix");
		int r2 = Integer.parseInt(br.readLine());
		int c2 = Integer.parseInt(br.readLine());
		if (c1 != r2) {
			System.out.println("Matrix multiplication not possible");
			System.exit(0);
		}
		int a[][] = new int [r1][c1];
		int b[][] = new int [r2][c2];
		int c[][] = new int [r1][c2];
		System.out.println("\nEnter elements into the first matrix");
		for (int i = 0; i < r1; i++) {
			System.out.println("Entering elements into row " + (i+1));
			for (int j = 0; j < c1; j++)
				a[i][j] = Integer.parseInt(br.readLine());
		}
		System.out.println("\nEnter elements into the second matrix");
		for (int i = 0; i < r2; i++) {
			System.out.println("Entering elements into row " + (i+1));
			for (int j = 0; j < c2; j++)
				b[i][j] = Integer.parseInt(br.readLine());
		}
		System.out.println("\nThe first matrix is:");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) 
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		System.out.println("\nThe second matrix is:");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) 
				System.out.print(b[i][j] + " ");
			System.out.println();
		}
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < r2; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		System.out.println("\nThe resultant matrix is: ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}

		