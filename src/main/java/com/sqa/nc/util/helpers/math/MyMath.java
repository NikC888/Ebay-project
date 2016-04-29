/**
 *   File Name: MyMath.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */
package com.sqa.nc.util.helpers.math;

import java.util.*;

/**
 * MyMath //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class MyMath {

	static ArrayList<String> mathList = new ArrayList<String>();

	// A static method which divides one number by another
	public static double divideNumbers (double num1, double num2) {
		double quotient = num1 / num2;
		return quotient;
	}

	// checks whether number passed in is prime or not
	public static boolean evalPrime (double number) {
		System.out.println("eval prime dis number: " + number);
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// A static method which let the user know if there is a clean division with
	// no remainder
	public static boolean hasCleanDivision (double number, double number2) {
		double var;
		var = number % number2;
		System.out.print("remainder: " + var);
		if (var == 0)
			return true;
		else
			return false;
	}

	// A static method which multiplies a set of numbers
	public static double multNumbers (double... nums) {
		double product = 1;
		for (int i = 0; i < nums.length; i++) {
			product *= nums[i];
		}
		return product;
	}

	// A static method which multiplies a given number by the amount
	public static double powerNumber (double number, double power) {
		double answer = 1;
		for (double i = 0; i < power; i++) {
			answer *= number;
		}
		if (power < 0)
			System.out.println("power is less than 0");
		return answer;
	}

	private double Result;

	// A class which gets the total of an instance object of type MyMath Class
	// Default Constructor
	public MyMath () {
		setResult(0);
	}

	// Argument Constructor, starting value given
	public MyMath (double defaultNum) {
		setResult(defaultNum);
	}

	// To Add a number to total
	public double add (double num) {
		String c = String.format("Add %.3f to %.3f", num, getTotal());
		mathList.add(c);
		setResult(getResult() + num);
		return getTotal();
	}

	public void displayOperations (int numOfOperations) {
		for (int i = numOfOperations; i > 0; i--)
			System.out.println(mathList.get(mathList.size() - i));
	}

	// To divide a number of total
	public double div (double num) {
		String c = String.format("Div %.3f from %.3f", num, getTotal());
		mathList.add(c);
		setResult(getResult() / num);
		return getTotal();
	}

	// Nothing to do here, an instance version just call the static version and
	// passes in the total of what is saved in the instance's variable double
	// result (Truncating it to an int by a cast)
	public boolean evalPrime () {
		System.out.println("PUBLIC eval prime method");
		return MyMath.evalPrime(getTotal());
	}

	/**
	 * @return the result
	 */
	public double getResult () {
		return this.Result;
	}

	// To get the current total
	public double getTotal () {
		return this.Result;
	}

	// To multiply a number to total
	public double mult (double num) {
		String c = String.format("Mult %.3f by %.3f", num, getTotal());
		mathList.add(c);
		setResult(getResult() * num);
		return getTotal();
	}

	// To reset total to 0
	public void reset () {
		mathList.add("Reset total to 0");
		setResult(0);
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult (double result) {
		this.Result = result;
	}

	// To subtract a number from total
	public double sub (double num) {
		String c = String.format("Sub %.3f from %.3f", num, getTotal());
		mathList.add(c);
		setResult(getResult() - num);
		return this.Result;
	}
}
