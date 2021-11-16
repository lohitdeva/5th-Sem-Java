//Program to display prime numbers within a given range
import java.io.*;
class PrgA2 {
	public static void main(String args[]) throws IOException {
		int l, u, n, i;
		boolean flag;
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("\n\t\t\t ***** DISPLAY PRIME NUMBERS IN THE GIVEN RANGE *****\n");
		System.out.println("Enter the upper and lower limits");
		l = Integer.parseInt(ds.readLine());
		u = Integer.parseInt(ds.readLine());
		if (l < 2)
			l = 2;
		System.out.print("The prime numbers between " + l + " and " + u + " are:\n");
		for (n = l; n <= u; n++) {
			flag = true;
			for (i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
					System.out.print(n + "\t");
		}
	}
}