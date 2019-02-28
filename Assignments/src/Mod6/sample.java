package Mod6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.edureka.co/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Thread.sleep(3000);
		  try {
				driver.findElement(By.id("exitpop_mode"));
				driver.findElement(By.className("modal-dialog"));
				driver.findElement(By.className("modal-content"));
				Thread.sleep(5000);
				//WebDriverWait wait = new WebDriverWait(driver, 50);
				driver.findElement(By.xpath("//div[@id=\"exitpop_mode\"]//button[@type=\"button\"]")).click();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.cssSelector("#sg_popup_email")).clear();
		  
		 
		  driver.findElement(By.cssSelector("#sg_popup_email")).sendKeys("testingedureka@gmail.com");
		  
		  driver.findElement(By.cssSelector("#sg_popup_phone_no")).sendKeys("7417518981");
		  //driver.findElement(By.xpath("//div[@class=\"login_video_frm signup-vd-box silent-signup-division\"]//div[@class=\"europe_term\"]//p[@class=\"termsandcond\"]")).click();
		  driver.findElement(By.cssSelector("#tc_agree")).click();
		  driver.findElement(By.cssSelector("#new_sign_up_mode > div > div > div.modal-body > div.login_video_frm.signup-vd-box.silent-signup-division > form > button")).click();
		  
		  //String expected="You are registered with us. Login to continue.";
		  
		  WebElement actual=driver.findElement(By.id("emailError"));
		  String error=actual.getText();
		  System.out.print(error);
		  
		  
		  //Assert.assertEquals(expected, actual);
		  

	}

}
