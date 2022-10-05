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
	
	/**
	 * Multiplies the two given numbers
	 * 
	 * @param number1 A number to be multiplied
	 * @param number2 A number to be multiplied
	 */
	public static void multiplication(int number1, int number2) {
		System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
	}
	
	/**
	 * Divides the two given numbers
	 * 
	 * @param number1 Number to have the division applied to
	 * @param number2 The number we will divide with the first one
	 */
	public static void division(int number1, int number2) {
		System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
	}
	
	/**
	 * Raises a base to the exponent given
	 * 
	 * @param base
	 * @param exponent
	 */
	public static void power(int base, int exponent) {
		
		int result = 1;
		
		for(int i = 0; i < exponent; i++)
		{
			result *= base;
		}
		
		System.out.println(base + " ^ " + exponent + " = " + result);
		
	}
}
