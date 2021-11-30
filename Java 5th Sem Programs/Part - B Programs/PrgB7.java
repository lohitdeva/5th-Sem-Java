//Java program to handle exceptions with try, catch and finally

class Dex extends Exception {
	Dex (String message) {
		super(message);
	}
}

class PrgB7 {
	public static void main (String[] args) {
		System.out.println("*** PROGRAM TO HANDLE EXCEPTIONS USING TRY, CATCH, AND FINALLY ***");
		double a = 15.3, b = 35.9;
		try {
			double c = a/b;
			if (c < 0.5)
				throw new Dex("Less than half");
		} catch (Dex e) {
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
	}
}

		