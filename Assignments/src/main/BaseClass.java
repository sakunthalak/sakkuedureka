package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30	,TimeUnit.SECONDS);
		driver.get("https://moovicart.com/");
		}
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

		
	
	
}
