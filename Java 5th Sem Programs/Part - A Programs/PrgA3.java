//Program to sort elements of an array in ascending and descending order
import java.io.*;
class PrgA3 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array:");
		int size = Integer.parseInt(br.readLine());
		int[] numbers = new int[size];
		System.out.println("Enter the elements into the array:");
		for(int i = 0; i < size; i++) {
			System.out.print("Element no. " + (i+1) + ": ");
			numbers[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Array before sorting:");
		for(int i = 0; i < size; i++)
			System.out.print(numbers[i] + " ");
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting, the array in ascending order is");
		for(int i = 0; i < size; i++)
			System.out.print(numbers[i] + " ");
		System.out.println("\nAfter sorting, the array in descending order is");
		for(int i = size - 1; i >= 0; i--)
			System.out.print(numbers[i] + " ");
	}
}