/**
 *   File Name: Automation.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 16, 2016
 *
 */
package com.sqa.nc.util.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

/**
 * Automation //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class Automation {

	public static boolean checkPageTitle (String url, String expectedPageTitle) {
		String actualPageTitle;
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		actualPageTitle = driver.getTitle();
		if (actualPageTitle.equalsIgnoreCase(expectedPageTitle)) {
			return true;
		} else {
			return false;
		}
	}
}
