package main.calculations;

public class BasicMath {

	/**
	 * Sums the two given numbers and prints the result in console
	 * 
	 * @param number1 A number to be summed
	 * @param number2 A number to be summed
	 */
	public static void sum(int number1, int number2) {
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}
	
	/**
	 * Substracts the second given number, to the first one
	 * 
	 * @param number1 The number that will have substraction applied
	 * @param number2 The number that will be substracted to the first one
	 */
	public static void substraction(int number1, int number2) {
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
	}
}
