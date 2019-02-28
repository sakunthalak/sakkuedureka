package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class padmasample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("viswasakku@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sujal@1234");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.className("uiScrollableAreaContent"));
		driver.findElement(By.xpath("//li[@class=\"_54ni navSubmenu _6398 _64kz __MenuItem\"]//span[@class=\"_54nh\"]/form")).click();
		
		//driver.findElement(By.className("_w0d _w0d")).click();
		
		
		
		

	}

}
