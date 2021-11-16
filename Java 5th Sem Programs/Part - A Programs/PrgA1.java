//Program to compute the factorial of a list of numbers using command line arguments
class PrgA1 {
	public static void main(String args[]) {
		for (int i = 0; i <= (args.length - 1); i++) {
			long factorial = 1;
			for (int j = Integer.parseInt(args[i]); j >= 1; j--)
				factorial *= j;
			System.out.println("Factorial of "+args[i]+" = "+factorial);
		}
    }
}