package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrameHandling {
	
	public void main(String[] args){
		
		ChromeDriver chrome;
		
		String url="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
		
		
		
			System.setProperty("webdriver.chrome.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
			chrome= new ChromeDriver();
			
			chrome.manage().window().maximize();
			chrome.manage().deleteAllCookies();
			chrome.get(url);
					
			chrome.switchTo().frame("iframeResult");
			chrome.findElementByTagName("using");
	}
	

}
