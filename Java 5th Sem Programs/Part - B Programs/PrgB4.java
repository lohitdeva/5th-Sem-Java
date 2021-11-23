//Program to implement an interface

class Student {
	int r;
	void getNo (int n) {
		r = n;
	}
	void putNo () {
		System.out.println("Roll number: " + r);
	}
}

class Test extends Student {
	float p1, p2;
	void getMarks(float m1, float m2) {
		p1 = m1;
		p2 = m2;
	}
	void putMarks() {
		System.out.println("Marks obtained:\np1 = " + p1 + "\np2 = " + p2);
	}
}

interface Sports {
	float sportwt = 6.0f;
	void putWt();
}

class Results extends Test implements Sports {
	float tot;
	public void putWt() {
		System.out.println("Sport wt = " + sportwt);
	}
	void display() {
		tot = p1 + p2 + sportwt;
		putNo();
		putMarks();
		putWt();
		System.out.println("Total = " + tot);
	}	
}

class PrgB4 {
	public static void main(String[] args) {
		System.out.println("*** PROGRAM TO IMPLEMENT AN INTERFACE ***");
		Results s1 = new Results();
		s1.getNo(1111);
		s1.getMarks(27.5f, 33.0f);
		s1.display();
	}
}