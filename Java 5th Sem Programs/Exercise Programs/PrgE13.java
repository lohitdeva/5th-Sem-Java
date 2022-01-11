//Program to demonstrate run-time polymorphism (method overriding)

import java.io.*;

abstract class Vehicle {

	String owner;

	Vehicle(String owner) {
		this.owner = owner;
	}

	abstract void topSpeed();

}

class Car extends Vehicle {
	
	Car(String owner) {
		super(owner);
	}

	void topSpeed() {
		System.out.println(super.owner + " can drive the car at a top speed of 240 km/h ");
	}

}

class Bike extends Vehicle {
	
	Bike(String owner) {
		super(owner);
	}

	void topSpeed() {
		System.out.println(super.owner + " can drive the bike at a top speed of 150 km/h");
	}

}

class PrgE13 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("*** PROGRAM TO DEMONSTRATE RUNTIME POLYMORPHISM ***");
		
		System.out.println("Enter the name of the vehicle owner");
		String owner = br.readLine();

		Car car = new Car(owner);
		Bike bike = new Bike(owner);

		System.out.println();
		car.topSpeed();
		bike.topSpeed();

	}

}
	