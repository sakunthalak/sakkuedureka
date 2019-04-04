package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGridsample {
	WebDriver driver;
	String baseURL,nodeURL;
	
	
	@BeforeTest 
	public void invokeBrowser() throws MalformedURLException {
		baseURL="https://www.facebook.com/";
		nodeURL="http://192.168.0.4:37018/wd/hub";
		
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver=new RemoteWebDriver(new URL(nodeURL),capability);
		
		
	}
	@Test
	public void simpleTest() {
		driver.get(baseURL);
		String title=driver.getTitle();
		System.out.println(title);
	}
}
