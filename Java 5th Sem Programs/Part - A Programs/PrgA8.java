//Program to calculate bonus for different departments using method overriding

import java.io.*;

abstract class Dept {
	double bp;
	
	Dept(double basic) {
		bp = basic;
	}
	
	void disp() {
		System.out.println("Base pay = " + bp);
	}
	
	abstract double bonus();
}

class Sales extends Dept {
	Sales (double basic) {
		super (basic);
	}
	
	public double bonus() {
		return bp * 0.2;
	}
}

class Marketing extends Dept {
	Marketing (double basic) {
		super (basic);
	}
	
	public double bonus() {
		return bp * 0.3;
	}
}

class HR extends Dept {
	HR (double basic) {
		super (basic);
	}
	
	public double bonus() {
		return bp * 0.5;
	}
}

class PrgA8 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" *** PROGRAM TO CALCULATE DEPARTMENT BONUSES BY USING METHOD OVERRIDINIG ***");
		System.out.println("Enter basic pay");
		double bp = Double.parseDouble(br.readLine());
		Sales s = new Sales(bp);
		s.disp();
		System.out.println("Bonus of Sales department = " + s.bonus());
		Marketing m = new Marketing(bp);
		m.disp();
		System.out.println("Bonus of Marketing department = " + m.bonus());
		HR h = new HR(bp);
		h.disp();
		System.out.println("Bonus of HR department = " + h.bonus());
	}
}