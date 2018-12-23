package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utils {
	static WebDriver driver;

	public static WebDriver openBrowser(String browserType){
		String currentDir = System.getProperty("user.dir");

		if (browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", currentDir+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", currentDir+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void getUrl(WebDriver driver, String url){

		if(url.isEmpty()){
			url = "about:blank";
		}
		driver.get(url);
	}
	
	public static void waitForElement(String element) {
		
	}
	
	public static void closeBrowser(WebDriver driver){
		if (driver != null){
			driver.close();
			driver.quit();
		}
	}}