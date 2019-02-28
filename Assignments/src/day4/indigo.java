package day4;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class indigo {

	ChromeDriver	chrome;
	String	url="https://www.goindigo.in/?linkNav=home_header";
	
	public void InvokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		chrome= new ChromeDriver();
		chrome.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		chrome.get(url);
		chrome.manage().window().maximize();
		
	}
	public void IndigoSearch() throws Throwable
	{
		
		chrome.findElementById("oneWayTrip").click();
		
		
		try {
			chrome.findElementByXPath("/html/body/div[2]/div[4]/div/div/div[3]/button").click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		
		
		chrome.findElementByCssSelector("#bookFlightTab > form > div.or-tab-content.trip-tab-content > div:nth-child(1) > div.col-sm-5.col-5.padd-left > div > div > input").clear();
		
		Thread.sleep(200);
		chrome.findElement(By.name("or-src")).clear();
		chrome.findElementByXPath("//div[@id=\"bookFlightTab\"]//div[@class=\"or-tab-content trip-tab-content\"]//div[9]/div[1]").click();
		chrome.findElementByXPath("//*[@id=\"bookFlightTab\"]/form/div[2]/div[1]/div[2]/div/div/input").clear();
		chrome.findElementByXPath("*//div[@id='oneWay']//div[@class='city-dropdown-list city-name-to']/ul/li[@data-air-iata='LKO']").click();
		
		
		chrome.findElementByXPath("//*[@id='oneWay']//input[@class='count travellers-count']").click();
		Select dropdown=new Select(chrome.findElementByXPath("//*[@name='indiGoOneWaySearch.PassengerCounts[0].Count']"));
		dropdown.selectByIndex(2);
		
		chrome.findElementByXPath("//*[@name='indiGoOneWaySearch.PassengerCounts[1].Count']").click();
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select dropdown1=new Select(chrome.findElementByXPath("//*[@name='indiGoOneWaySearch.PassengerCounts[1].Count']"));
		dropdown1.selectByIndex(2);
		
		chrome.findElementByXPath("//*[@name='indiGoOneWaySearch.InfantCount']").sendKeys(Keys.TAB);
		
		chrome.findElementByXPath(".//*[@id='ui-id-2-button']").click();
		
		Thread.sleep(300);
		chrome.findElementByXPath(".//*[@id='oneWay']/form/div[2]/button").click();
		chrome.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  WebElement list1=chrome.findElementByXPath("*//div[@class='container mobile-row oneWay']");
			System.out.println(list1.getText());


		 
		
		
	}
	public void close() {
		chrome.close();
	}
}

