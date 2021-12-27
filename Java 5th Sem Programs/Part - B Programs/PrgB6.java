//Program to create user defined exception

class MyException extends Exception {
	private int detail;
	
	MyException (int a) {
		detail = a;
	}

	public String toString() {
		return "MyException [" + detail + "]";
	}
}

class PrgB6 {
	static void compute(int a)throws MyException{
		System.out.println("Called compute (" + a + ")");
		if (a > 10)
			throw new MyException(a);
		System.out.println("Normal exit");
	}
	public static void main(String[] args) {
		System.out.println("*** PROGRAM TO CREATE USER DEFINED EXCEPTION ***");
		try {
			compute(1);
			compute(20);
		} catch (Exception e) {
			System.out.println("Caught: " + e);
		}
	}
}
