//Program to display Floyd's triangle

import java.io.*;

class PrgE3 {
	public static void main(String args[]) throws IOException {
		int i = 1, j, n = 1, size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows in Floyd's Triangle");
		size = Integer.parseInt(br.readLine());
		System.out.println("Floyd's traingle with " + size + " rows");
		while (i <= size) {
			j = 1;
			while (j <= i) {
				System.out.print(n + " ");
				n++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}