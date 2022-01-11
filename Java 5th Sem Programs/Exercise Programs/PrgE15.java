//Program to demonstrate hierarchial inheritance

class A {

	int a = 1;

	void message1() {
		System.out.println("This message was inside class A");
	}

	void number1() {
		System.out.println("a: " + a);
	}

}

class B extends A {

	int b = 2;

	void message2() {
		System.out.println("This message was inside class B");
	}

	void number2() {
		number1();
		System.out.println("b: " + b);
		System.out.println("a + b: " + (a + b));
	}

}

class C extends B {

	int c = 3;

	void message3() {
		System.out.println("This message was inside class C");
	}

	void number3() {
		number2();
		System.out.println("c: " + c);
		System.out.println("a + b + c: " + (a + b + c));
	}

}

class PrgE15 {

	public static void main(String[] args) {
	
		A a = new A();
		System.out.println("\nInside class A");
		a.message1();
		a.number1();

		B b = new B();
		System.out.println("\nInside class B");
		b.message1();
		b.message2();
		b.number2();

		C c = new C();
		System.out.println("\nInside class C");
		c.message1();
		c.message2();
		c.message3();
		c.number3();

	}

}


		
