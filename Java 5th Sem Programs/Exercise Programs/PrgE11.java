//Program to compute electricity bill

import java.io.*;
import java.text.DecimalFormat;

class PrgE11 {
	static int fixed_charge = 60;
	
	static double calculateAmount(int x, int y) {
		int reading = y - x;
		double amount = 0;
		if (reading > 0) {
			if (reading <= 30)
				amount = reading * 3.75;
			else if (reading > 30 && reading <= 100) 
				amount = 112.5 + ((reading - 30) * 5.2);
			else if (reading > 100 && reading <= 200) 
				amount = 476.5 + ((reading - 100) * 6.75);
			else 
				amount = 1151.5 + ((reading - 200) * 7.8);
		}
		else {
			System.out.println("Invalid reading");
			System.exit(0);
		}
		return amount;
	}
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("##.00");
		int previous_reading, current_reading;
		double amount;
		String name;
		System.out.println("Enter the name of the customer: ");
		name = br.readLine();
		System.out.println("Enter the previous and current readings");
		previous_reading = Integer.parseInt(br.readLine());
		current_reading = Integer.parseInt(br.readLine());
		amount = calculateAmount(previous_reading, current_reading) + fixed_charge;
		double tax = 0.05 * amount;
		amount += tax;
		System.out.println("\n**********ELECTRICITY BILL **********\n");
		System.out.println("Name: " + name);
		System.out.println("Previous Reading: " + previous_reading + " kWh");
		System.out.println("Current Reading: " + current_reading + " kWh");
		System.out.println("Fixed Charges: " + fixed_charge);
		System.out.println("Electricity Tax at 5%: " + df.format(tax));
		System.out.println("\nTotal Bill Amount: " + df.format(amount));
	}
}
