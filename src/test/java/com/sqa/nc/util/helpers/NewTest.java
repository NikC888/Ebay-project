package com.sqa.nc.util.helpers;

import org.testng.*;
import org.testng.annotations.*;

public class NewTest {

	@DataProvider
	public Object[][] dp () {
		return new Object[][] {
				new Object[] { 1, "a" },
				new Object[] { 2, "b" },
		};
	}

	@Test (dataProvider = "dp")
	public void f (Integer n, String s) {
		String url = "http://amazon.com";
		String expectedTitle =
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		boolean result = Automation.checkPageTitle(url, expectedTitle);
		Assert.assertTrue(result);
	}
}
