/**
 *   File Name: MyMathTest.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */
package com.sqa.nc.util.helpers.math;

import static org.testng.Assert.*;

import java.util.*;

import org.testng.annotations.*;

/**
 * MyMathTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class MultiplicationTests {

	@DataProvider
	public static Object[][] getData () {
		Object[][] data = {
							{ new double[] { 2.0, 3.0, 5.0 }, 30.0 },
							{ new double[] { 5.0 }, 5.0 },
							{ new double[] { 4.0 }, 4.0 },
							{ new double[] { 1.0 }, 1.0 },
							{ new double[] { 3.0 }, 3.0 },
							{ new double[] { 2.0 }, 2.0 }
		};
		return data;
	}

	@Test (dataProvider = "getData")
	public void testMultNumbers (double[] numbers, double expectedResult) {
		double actualResult = MyMath.multNumbers(numbers);
		String numbersString = Arrays.toString(numbers);
		String message = String.format("the product of multiplying all numbers %s together is %.1f", numbersString,
				actualResult);
		System.out.println(message);
		// Assert.assertEquals(message, this.expectedResult, actualResult, 0);
		assertEquals(actualResult, expectedResult, 0, message);
	}
}
