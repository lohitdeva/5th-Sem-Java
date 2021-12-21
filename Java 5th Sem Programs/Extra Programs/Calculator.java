//Program to simulate a calculator

import java.io.*;

class MathOperations {
	int add (int a, int b) {
		return a + b;
	}
	int subtract (int a, int b) {
		return a - b;
	}
	int multiply (int a, int b) {
		return a * b;
	}
	int divide (int a, int b) {
		return a / b;
	}
	int modulo (int a, int b) {
		return a % b;
	}
	int unaryAdd (int a) {
		return ++a;
	}
	int unarySubtract (int a) {
		return --a;
	}
	int exponent (int a, int b) {
		return (int)Math.pow(a,b);
	}
}

class Calculator {
	public static void main (String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MathOperations mo = new MathOperations();
		int x = 0, y = 0;
		System.out.println("***** PROGRAM TO SIMULATE A CALCULATOR *****");
		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo Division\n6. Unary Addition\n7. Unary Subtraction\n8. Exponentiation\n0. EXIT");
			System.out.println("\nEnter your choice");
			int choice = Integer.parseInt(br.readLine());
			if (choice > 0 && choice < 9) {
				if (choice != 6 && choice != 7) {
					System.out.println("Enter the two numbers");
					x = Integer.parseInt(br.readLine());
					y = Integer.parseInt(br.readLine());
				}
				else {
					System.out.println("Enter the number");
					x = Integer.parseInt(br.readLine());
				}
			}
			switch (choice) {
				case 1:
					System.out.println(x + " + " + y + " = " + mo.add(x,y));
				break;
				case 2:
					System.out.println(x + " - " + y + " = " + mo.subtract(x,y));
				break;
				case 3:
					System.out.println(x + " * " + y + " = " + mo.multiply(x,y));
				break;
				case 4:
					System.out.println(x + " / " + y + " = " + mo.divide(x,y));
				break;
				case 5:
					System.out.println(x + " % " + y + " = " + mo.modulo(x,y));
				break;
				case 6:
					System.out.println("++" + x + " = " + mo.unaryAdd(x));
				break;
				case 7:
					System.out.println("--" + x + " = " + mo.unarySubtract(x));
				break;
				case 8:
					System.out.println(x + " ^ " + y + " = " + mo.exponent(x,y));
				break;
				case 0:
					System.out.println("\nGOODBYE!");
					System.exit(0);
				break;
				default:
					System.out.println("Invalid option");
			}
		}
	}
}
		