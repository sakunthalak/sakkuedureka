package com.Moovicart.Producer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginWithPF extends Base{
	
	static WebDriver driver1;
	
	public LoginWithPF(WebDriver driver) {
		LoginWithPF.driver1=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(id="username")
	@CacheLookup
	private WebElement LoginID;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="login")
	private WebElement Login;
	
	@FindBy(linkText="New Registration")
	private WebElement  NewRegistration;
	
	@FindBy(linkText="Forgot Password")
	private WebElement Forgotton;
	
	@FindBy(linkText="Home")
	private WebElement MooviecartHome;
	
	@FindBy(linkText="How it works")
	private WebElement MoovicartHow;
	
	@FindBy(linkText="Services")
	private WebElement service;
	
	@FindBy(linkText="Trading options")
	private WebElement Trade;
	
	@FindBy(linkText="Pricing")
	private WebElement MoovicartPricing;
	
	@FindBy(linkText="Business Process")
	private WebElement MoovicartBusiness;
	
	@FindBy(className="dropdown-toggle")
	private WebElement MoovicartDropdown;
	
	@FindBy(linkText="FAQ's")
	private WebElement MoovicartFAQ;
	
	@FindBy(linkText="Contact Info")
	private WebElement MoovicartContact;
	
	
		
	
				
	
	public  void logInUser(String username,String password) {
		//LoginID.clear();
		LoginID.sendKeys(username);
		//Password.clear();
		Password.sendKeys(password);
		Login.click();
		
	}
	
	public  void  newRegistration() {
		NewRegistration.click();
	}
	
	public  void forgottonPassword() {
		Forgotton.click();
	}
	
	public void navigateHome() {
		MooviecartHome.click();
	}
	
	public  void howItWorks() {
		MoovicartHow.click();
	}
	public  void services() {
		service.click();
	}
	public void tradingOptions() {
		Trade.click();
	}
	public  void pricing() {
		MoovicartPricing.click();
		
	}
	public  void businessProcess() {
		MoovicartBusiness.click();
	}
//	public  void aboutMoovicart(String moovie) throws InterruptedException {
//		MoovicartDropdown.click();		
//		if(moovie=="aboutmoovicart")
//			driver.findElement(By.xpath("//ul[@class=\"multi-column-dropdown\"]/li[1]/a")).click();
//			
//			
//		else if(moovie=="Our Team")
//			driver.findElement(By.xpath("//ul[@class=\"multi-column-dropdown\"]/li[2]/a")).click();
//			
//			
//		else if(moovie=="Our Team")
//			driver.findElement(By.xpath("//ul[@class=\"multi-column-dropdown\"]/li[2]/a")).click();
//			
//		Thread.sleep(3000);	
//	}

	public  void frequentlyaskedQuestions() {
		MoovicartFAQ.click();
	}
	public  void contactINFO() {
		MoovicartContact.click();

}}
