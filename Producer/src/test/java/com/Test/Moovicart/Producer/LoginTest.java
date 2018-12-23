package com.Test.Moovicart.Producer;

import org.testng.annotations.Test;

import com.Moovicart.Producer.LoginWithPF;

import appModule.Produser_SyndicateDis;
import pom.WtioutPF.LoginWithoutPF;



public class LoginTest extends BaseTest {

//	WebDriver driver;
	@Test
	public void loginWithPageFactory() throws Exception {
		LoginWithPF test=new LoginWithPF(driver);
		test.logInUser("sakunthala", "london1234");
		Produser_SyndicateDis.Execute();
		
		
	}
	
	@Test(enabled=false)
	public void loginWithoutPageFactory() {
		LoginWithoutPF.logInUser("sakunthala", "london1234");
	}
	
	
}
