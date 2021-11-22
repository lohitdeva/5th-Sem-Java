//Program to use packages

import p1.MyFood;
import p2.MyFruits;

class PrgB5 {
	public static void main(String[] args) {
		System.out.println("*** PROGRAM TO CREATE AND USE PACKAGES ***");
		MyFood food = new MyFood();
		MyFruits fruits = new MyFruits();
		food.dispFood();
		fruits.dispFruits();
	}
}