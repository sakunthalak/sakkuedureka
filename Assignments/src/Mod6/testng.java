package Mod6;

import org.openqa.selenium.chrome.ChromeDriver;

public class testng {
ChromeDriver chrome;
String url="https://www.edureka.co/";

	public void openBrowser() {
		String currDir=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currDir+"\\chromedriver.exe");
		chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get(url);
		
	}
	public void login() {
		chrome.findElementByLinkText("Log In");
		
	}
	
	
}
