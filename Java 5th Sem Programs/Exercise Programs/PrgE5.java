//Program to find the largest and smallest among 4 numbers 

import java.io.*;

class PrgE5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int [4];
		System.out.println("Enter the four numbers: ");
		for (int i = 0; i < 4; i++)
			a[i] = Integer.parseInt(br.readLine());
		for (int i = 0; i < 4; i++) {
			int temp;
			for (int j = i + 1; j < 4; j++) {
				if (a[i] > a [j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Smallest number: " + a[0]);
		System.out.println("Largest number: " + a[3]);
	}
}
