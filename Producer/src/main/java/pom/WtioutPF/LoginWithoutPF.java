package pom.WtioutPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Moovicart.Producer.Base;



public class LoginWithoutPF  {
		
	
	static WebDriver driver = Base.getDriver();
	
	static WebElement LoginId = driver.findElement(By.id("username"));
	static WebElement Password = driver.findElement(By.id("password"));
	static WebElement Login = driver.findElement(By.id("login"));
	
	static WebElement NewRegistration = driver.findElement(By.linkText("New Registration"));
	static WebElement ForgottonPassword = driver.findElement(By.linkText(" Forgot Password "));
	
	static WebElement Home = driver.findElement(By.linkText("Home"));
	static WebElement HowitWorks = driver.findElement(By.linkText("How it works"));
	static WebElement Services = driver.findElement(By.linkText("Services"));
	static WebElement TradingOptions = driver.findElement(By.linkText("Trading options"));
	static WebElement Pricing = driver.findElement(By.linkText("Pricing"));
	static WebElement BusinessProcess = driver.findElement(By.linkText("Business Process"));
	static WebElement Moovicart = driver.findElement(By.className("dropdown-toggle"));
	static WebElement FAQ = driver.findElement(By.linkText("FAQ's"));
	static WebElement Contactinfo = driver.findElement(By.linkText("Contact Info"));
	
	public  static void logInUser(String username,String password) {
		
		LoginId.clear();
		LoginId.sendKeys(username);
		Password.clear();
		Password.sendKeys(password);
		Login.click();
		
	}
	
	public  void  newRegistration() {
		NewRegistration.click();
	}
	
	public  void forgottonPassword() {
		ForgottonPassword.click();
	}
	
	public void navigateHome() {
		Home.click();
	}
	
	public  void howItWorks() {
		HowitWorks.click();
	}
	public  void services() {
		Services.click();
	}
	public void tradingOptions() {
		TradingOptions.click();
	}
	public  void pricing() {
		Pricing.click();
		
	}
	public  void businessProcess() {
		BusinessProcess.click();
	}
}
