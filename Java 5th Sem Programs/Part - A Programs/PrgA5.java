//Program to find the area of geometrical figures using method overloading

import java.io.*;
import java.text.DecimalFormat;

class GeometricFig {
	double area (double r) {
		return Math.PI * Math.pow(r,2);
	}
	
	float area  (float s) {
		return (float)Math.pow(s,2);
	}
	
	double area (double l, double b) {
		return l * b;
	}
	
	float area (float b, float h) {
		return (float)0.5 * b * h;
	}
}

class PrgA5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("##.00");
		System.out.println("***** PROGRAM TO FIND THE AREA OF GEOMETRICAL FIGURES USING METHOD OVERLOADING *****");
		GeometricFig gf = new GeometricFig();
		System.out.println("Enter double value for radius of circle");
		double r = Double.parseDouble(br.readLine());
		System.out.println("Area of circle = " + df.format(gf.area(r)));
		System.out.println("Enter float value for side of square");
		float s = Float.parseFloat(br.readLine());
		System.out.println("Area of square = " + df.format(gf.area(s)));
		System.out.println("Enter double values of length and breadth of rectangle");
		double l = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		System.out.println("Area of rectangle = " + df.format(gf.area(l, b)));
		System.out.println("Enter float values for base and height of triangle");
		float ba = Float.parseFloat(br.readLine());
		float he = Float.parseFloat(br.readLine());
		System.out.println("Area of triangle = " + df.format(gf.area(ba, he)));
	}
}