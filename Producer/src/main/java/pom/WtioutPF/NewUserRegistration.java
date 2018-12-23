package pom.WtioutPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewUserRegistration  {
	static WebDriver driver;
	
	static WebElement FristName=driver.findElement(By.id("firstName"));
	static WebElement LastName=driver.findElement(By.id("lastName"));
	static WebElement Email=driver.findElement(By.id("Email"));
	static WebElement CountryCode=driver.findElement(By.id("phoneCode"));
	static WebElement Phone=driver.findElement(By.name("Phone"));
	static Select MembershipType=new Select(driver.findElement(By.id("Membership")));
	static WebElement Address=driver.findElement(By.id("Address"));
	static WebElement City=driver.findElement(By.id("City"));
	static WebElement State=driver.findElement(By.id("State"));
	static Select Country=new Select(driver.findElement(By.id("Country")));
	static WebElement PostalCode=driver.findElement(By.id("zipCode"));
	
	static WebElement Username=driver.findElement(By.id("userName"));
	static WebElement Password=driver.findElement(By.id("password"));
	static WebElement Accept=driver.findElement(By.xpath("//*[@id=\"registration\"]/tbody/tr[29]/td[2]/table/tbody/tr/td[1]/input"));
	static WebElement submit=driver.findElement(By.id("submit"));

	
	public static void NewUserReg(String first,String last,String email,String phonecode,String phone,String membershiptype,String adress,String city,String state,String country,String zipcode,String username,String password) {
		FristName.sendKeys(first);
		LastName.sendKeys(last);
		Email.sendKeys(email);
		CountryCode.sendKeys(phonecode);
		Phone.sendKeys(phone);
		
		if(membershiptype=="Audience")
			MembershipType.selectByValue("1");
		else if(membershiptype=="Distributor")
			MembershipType.selectByValue("2");
		else if(membershiptype=="Producer")
			MembershipType.selectByValue("3");
			
		Address.sendKeys(adress);
		City.sendKeys(city);
		State.sendKeys(state);
		Country.selectByVisibleText(country);
		PostalCode.sendKeys(zipcode);
		Username.sendKeys(username);
		Password.sendKeys(password);
		Accept.isSelected();
		//submit.click();
		
	}
	
	
}


