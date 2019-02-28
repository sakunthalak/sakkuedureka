package com.testng.practise.edurekhs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGGroup {
	WebDriver driver;
	
  @BeforeTest()
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.get("https://www.edureka.co/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  @Test(groups= {"tier-1"})
  
  public void alogin() throws InterruptedException {
	  WebElement login=driver.findElement(By.linkText("Log In"));
	WebDriverWait wait = new WebDriverWait(driver, 50);
	  wait.until(ExpectedConditions.visibilityOfAllElements(login));
	  login.click();
	  driver.findElement(By.id("si_popup_email")).clear();
	  driver.findElement(By.id("si_popup_email")).sendKeys("testingedureka@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.id("si_popup_passwd")).clear();
	  driver.findElement(By.id("si_popup_passwd")).sendKeys("12345678");
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("#new_sign_up_mode > div > div > div.modal-body > div.login_video_frm.login-vd-box.sigin-new-division > form > button")).click();
	  Thread.sleep(3000);
  }
  
  
  @Test(groups= {"tier-2"})
  public void browsingAllCourses() {
	  //driver.findElement(By.className("dropdown home_topdropdown"));
	  Actions action=new Actions(driver);
	  
	  WebElement allcourse=driver.findElement(By.cssSelector("#dLabel"));
	  action.moveToElement(allcourse).click().build().perform();
	  try {
			driver.findElement(By.id("exitpop_mode"));
			driver.findElement(By.className("modal-dialog"));
			driver.findElement(By.className("modal-content"));
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[@id=\"exitpop_mode\"]//button[@type=\"button\"]")).click();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
  @Test(groups= {"tier-3"})
  public void clogout() throws InterruptedException {
	  driver.findElement(By.className("webinar-profile-name")).click();;
	  Thread.sleep(4000);
	  driver.findElement(By.cssSelector("#header-II > section > nav > div > ul.nav.navbar-nav.navbar-right.profile.pull-right > li.dropdown.userdrop.hidden-sm.hidden-xs.open > ul > li:nth-child(6) > a")).click();

	  
  }
  
  @Test(groups= {"tier-4"})
  public void signon() {
	  driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.cssSelector("#sg_popup_email")).clear();	  
		driver.findElement(By.cssSelector("#sg_popup_email")).sendKeys("testingedureka@gmail.com");		driver.findElement(By.cssSelector("#sg_popup_phone_no")).clear(); 
		  driver.findElement(By.cssSelector("#sg_popup_phone_no")).sendKeys("7417517511");
		  //driver.findElement(By.xpath("//div[@class=\"login_video_frm signup-vd-box silent-signup-division\"]//div[@class=\"europe_term\"]//p[@class=\"termsandcond\"]")).click();
		  driver.findElement(By.cssSelector("#tc_agree")).click();
		  driver.findElement(By.cssSelector("#new_sign_up_mode > div > div > div.modal-body > div.login_video_frm.signup-vd-box.silent-signup-division > form > button")).click();
		  WebElement actual=driver.findElement(By.id("emailError"));
		  String error=actual.getText();
		  System.out.print(error);
	  
  }
  
@AfterTest
public void closeBrowser() {
	driver.close();
}
}
