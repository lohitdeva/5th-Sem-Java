/*	Print area of two rectangles having sides (4,5) and (5,8) using
	a method and parameters passed via constructor */
	
class Rectangle {
	double l, b;
	
	Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}
	
	double area() {
		return l*b;
	}
}

class PrgE10 {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		System.out.println("Area of rectangle 1: " + r1.area());
		System.out.println("Area of rectangle 2: " + r2.area());
	}
}