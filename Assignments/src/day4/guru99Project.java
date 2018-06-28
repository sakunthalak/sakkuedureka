package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru99Project {

	ChromeDriver chrome;
	
	String url="http://demo.guru99.com/v4/";
	
	public void InvokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
		chrome= new ChromeDriver();
		
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.get(url);
				}
	
	public void login(String userid,String password)
	{
		
		chrome.findElement(By.name("uid")).sendKeys(userid);
		chrome.findElement(By.name("password")).sendKeys(password);
		chrome.findElement(By.name("btnLogin")).click();
		
	}
	public void AddCustomer()
	{
		chrome.findElement(By.linkText("New Customer")).click();	
	}
	public void AddNewCustomer()
	{
		chrome.findElement(By.name("name")).sendKeys("sakku");
		chrome.findElement(By.xpath("//input[@value='f']")).click();
		chrome.findElement(By.name("dob")).sendKeys("03/16/1989");
		chrome.findElement(By.name("addr")).sendKeys("oldbourne");
		chrome.findElement(By.name("city")).sendKeys("london");
		chrome.findElement(By.name("state")).sendKeys("essex");
		chrome.findElement(By.name("pinno")).sendKeys("517325");
	chrome.findElement(By.name("telephoneno")).sendKeys("0123456789");
	String emailid="ss"+System.currentTimeMillis()+"@gmail.com";
	System.out.println("");
	chrome.findElement(By.name("emailid")).sendKeys(emailid);
	chrome.findElement(By.name("password")).sendKeys("fksdkl");
	chrome.findElement(By.name("sub")).click();
	}
	public String getCustomerID()
	{
		
		String  customer;
		customer=chrome.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	    return customer;
	}
	public void addNewAccount(String customerId,String  accountType )
	{ 
		chrome.findElement(By.linkText("New Account")).click();
		chrome.findElementByName("cusid").click();
		
		chrome.findElementByName("cusid").sendKeys(customerId);
		WebElement selAcc=chrome.findElementByName("selaccount");
		Select dropdown=new Select(selAcc);
		
		WebElement firstSelectOption;
		//firstSelectOption=dropdown.getFirstSelectedOption();
		//System.out.println("Before selecting   "+firstSelectOption.getText());
		
		dropdown.selectByVisibleText(accountType);
		firstSelectOption=dropdown.getFirstSelectedOption();
		System.out.println("After selecting"+firstSelectOption.getText());
		
		chrome.findElementByName("inideposit").sendKeys("1346632");
		chrome.findElementByName("button2").click();	
		
		
		
	
	}
}

