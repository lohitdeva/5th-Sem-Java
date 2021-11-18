//Program to find odd and even numbers between a given range

import java.io.*;

class PrgE8 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lower and upper limits");
		int low = Integer.parseInt(br.readLine());
		int up = Integer.parseInt(br.readLine());
		if (low >= up) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int range = ((up - low) / 2) + 1;
		int odd_nums [] = new int [range];
		int even_nums [] = new int [range];
		int i = 0, j = 0;
		while (low <= up) {
			if (low % 2 == 0) {
				even_nums[i] = low;
				i++;
			}
			else {
				odd_nums[j] = low;
				j++;
			}
			low++;
		}
		System.out.println("The odd numbers are: ");
		for (int z = 0; z < odd_range; z++) {
			if (odd_nums[z] == 0)
				continue;
			System.out.print(odd_nums[z] + " ");
		}
		System.out.println("\nThe even numbers are: ");
		for (int z = 0; z < even_range; z++) {
			if (even_nums[z] == 0)
				continue;
			System.out.print(even_nums[z] + " ");
		}
	}
}
