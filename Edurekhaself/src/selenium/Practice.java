package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Practice {
	
	static WebDriver driver;
	String currentDir = System.getProperty("user.dir");
	
	
	
	
	@BeforeClass
	public void launchBrowser() 
	{		
		System.setProperty("webdriver.chrome.driver", currentDir+"\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://amazon.co.uk");
		
	}
	@Test
	public void navigatescroll() {
		driver.findElement(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[3]/a/i")).click();
		
	}
	@Test(priority=1,enabled=false)
	public void  userlogin()
	{
		Actions action=new Actions(driver);
		WebElement helloSignin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		action.moveToElement(helloSignin).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		login("viswasakku@gmail.com","Sujal@1234");
		
	}
	
	public void login(String username,String password) {
		
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
			
		
		
	}
	@Test(priority=2,enabled=false)
	public void signout() {
		Actions action=new Actions(driver);
		WebElement userSignin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		action.moveToElement(userSignin).build().perform();
		driver.findElement(By.id("nav-item-signout")).click();
		
		
		
	}
	@Test(priority=3,enabled=false)
	public void  userlogin1()
	{
		login("poornesh.sp@gmail.com","Sujal@1234");
		
	}
	@Test(priority=4,enabled=false)
	public void signoutseconduser() {
		Actions action=new Actions(driver);
		WebElement userSignin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		action.moveToElement(userSignin).build().perform();
		driver.findElement(By.id("nav-item-signout")).click();
		driver.get("https://amazon.co.uk");
		
		
		
	}
	
	@AfterClass(enabled=false)
	public void closeBrowser() {
		driver.close();
		
	}

}
