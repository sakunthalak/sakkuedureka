package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

 class eg{
	
}
public class HoverExample {
	
	static WebDriver driver;
	 
	
	public void OpenBrowser(String browsertype,String url)
	{
		
		if(browsertype.equalsIgnoreCase("firefox"));
		{System.setProperty("webdriver.gecko.driver", "C:\\Poornesh\\Selenium\\WorkSpace\\libs\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		if(browsertype.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(url.isEmpty())
		{
			url="about:blank";
		}
		driver.manage().window().maximize();
		driver.get(url);
		new Actions(driver).moveToElement(driver.findElement(By.id("_evidon_banner"))).moveToElement(driver.findElement(By.id("_evidon-accept-button")));
		driver.findElement(By.id("_evidon-accept-button")).click();
		driver.switchTo().activeElement().click();
	}
	public void closebrowser() {
		if(driver!=null) {
		driver.close();}
	}
	public void hoveraction() {
		
		WebElement solutions=driver.findElement(By.linkText("Solutions"));
		new Actions(driver).moveToElement(solutions).build().perform();
		
		driver.findElement(By.linkText("Cloud")).click();
	
		
		
	}
	public static void main(String[] args) {
		HoverExample HE=new HoverExample();
		HE.OpenBrowser("chrome", "https://www.dell.com");
		HE.hoveraction();
		HE.closebrowser();
		
	}
	
	
	

}
