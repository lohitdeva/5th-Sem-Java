//Program to find odd and even numbers between a given range

import java.io.*;

class PrgE8 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lower and upper limits");
		int low = Integer.parseInt(br.readLine());
		int up = Integer.parseInt(br.readLine());
		int range = (up - low) + 1;
		int even_range, odd_range;
		if (range % 2 == 0) {
			odd_range = range / 2;
			even_range = odd_range;
		}
		else {
			if (low % 2 == 0) {
				odd_range = range / 2;
				even_range = odd_range + 1;
			}
			else {
				even_range = range/2;
				odd_range = even_range + 1;
			}
		}
		int odd_nums[] = new int [odd_range];
		int even_nums[] = new int [even_range];
	}
}