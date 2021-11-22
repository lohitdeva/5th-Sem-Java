//Program to demonstrate the concpet of inner and outer class

class Outer {
	int outdata = 10;
	
	void display() {
		Inner inobj = new Inner();
		System.out.println("Accessing from outer class: ");
		System.out.println("The value of outdata is: " + outdata);
		System.out.println("The value of indata is: " + inobj.indata);
	}
	
	class Inner {
		int indata = 20;
		
		void inmethod() {
			System.out.println("Accessing from the inner clss:");
			System.out.println("The sum of indata and outdata is: " + (indata + outdata));
		}
	}
}

class PrgB3 {
	public static void main(String[] args) {
		System.out.println("*** PROGRAM TO DEMONSTRATE INNER AND OUTER CLASS ***");
		Outer outobj = new Outer();
		outobj.display();
		Outer.Inner inobj1 = outobj.new Inner();
		inobj1.inmethod();
	}
}