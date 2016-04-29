package com.sqa.nc.util.helpers.math;

import static org.testng.Assert.*;

import org.testng.annotations.*;

public class PrimeTests {

	@DataProvider (name = "Prime Numbers Data")
	public Object[][] getData () {
		return new Object[][] {
				new Object[] { 3, true },
				new Object[] { 8, false },
				new Object[] { 49, false },
				new Object[] { 29, true },
				new Object[] { 1, true },
				new Object[] { 99, true },
		};
	}

	@Test (dataProvider = "Prime Numbers Data")
	public void testInstancePrime (double n, boolean expectedResult) {
		MyMath myMath = new MyMath(0);
		myMath.add(n);
		boolean actualResult = myMath.evalPrime();
		String message = String.format("%.0f is a prime #: %b. ", n, actualResult);
		System.out.println(message + "\n---------------------------------------");
		assertEquals(actualResult, expectedResult);
	}

	@Test (dataProvider = "Prime Numbers Data")
	public void testStaticPrime (double n, boolean expectedResult) {
		boolean actualResult = MyMath.evalPrime(n);
		String message = String.format("%.0f is a prime #: %b. ", n, actualResult);
		System.out.println(message + "\n---------------------------------------");
		// assertEquals(actualResult, expectedResult, 0, message);
		assertEquals(actualResult, expectedResult);
	}
}