package selenium;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



public class TakeScreenshotFB {
	
	
 static WebDriver driver;
 static String currentDir=System.getProperty("user.dir");
 
 @Test 
 public void launchBrowser() throws IOException {
	 System.setProperty("webdriver.chrome.driver", currentDir+"\\drivers\\chromedriver.exe");
	 
	 driver=new ChromeDriver();
	 driver.get("https://amazon.co.uk");
	 takeScreenshot("Amazon_HomePage");

 }
 
 public static void takeScreenshot(String filename) throws IOException {
	 
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(file,new File( "C:\\Users\\Poornesh\\git1\\Edurekhaself\\AllScreenshots"+filename+".jpg"));
	
	
 }

	
}
