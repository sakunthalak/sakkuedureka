package com.Test.Moovicart.Producer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Moovicart.Producer.Base;



public class BaseTest {
WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = Base.getSeleniumDriver();
	}

//	@AfterSuite
//	public void afterSuite() {
//		Base.closeDriver();
//	
//	}

	
	
	
	
}
