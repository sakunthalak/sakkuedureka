package com.Moovicart.Producer;

import org.openqa.selenium.WebDriver;

import utility.Utils;





public class Base {
	static WebDriver driver;

	/**
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver getSeleniumDriver() {
		driver = Utils.openBrowser("chrome");
		Utils.getUrl(driver, "https://moovicart.com/home");
		return driver;
	}
	
//	public static void closeDriver() {
//		Utils.closeBrowser(driver);
//	}

}
