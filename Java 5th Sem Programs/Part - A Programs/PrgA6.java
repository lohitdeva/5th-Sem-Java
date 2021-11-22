//Program to implement constructor overloading

import java.io.*;

class Box {
	double l, b, h;
	
	Box() {
		l = 0.0;
		b = 0.0;
		h = 0.0;
	}
	
	Box(double p) {
		l = p;
		b = p;
		h = p;
	}
	
	Box (double l, double b, double h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	void disp() {
		System.out.println("Length: " + l + "\nBreadth: " + b + "\nHeight: " + h);
	}
}

class PrgA6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*** PROGRAM TO IMPLEMENT CONSTRUCTOR OVERLOADING ***");
		Box b1 = new Box();
		System.out.println("Default constructor invoked");
		b1.disp();
		System.out.println("Enter double value");
		double p = Double.parseDouble(br.readLine());
		Box b2 = new Box(p);
		System.out.println("Constructor with one parameter invoked");
		b2.disp();
		System.out.println("Enter values for length, breadth, and height");
		double l = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double h = Double.parseDouble(br.readLine());
		Box b3 = new Box(l, b, h);
		System.out.println("Constructor with 3 parameters invoked");
		b3.disp();
	}
}