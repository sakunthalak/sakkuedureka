package day4;


import org.openqa.selenium.chrome.ChromeDriver;


public class indigo {

	ChromeDriver	chrome;
	String	url="https://www.goindigo.in/?linkNav=home_header";
	
	public void InvokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
		
		chrome= new ChromeDriver();
		
		chrome.manage().window().maximize();
		chrome.get(url);
	}
	public void IndigoSearch()
	{
		
		
		
		
		
		
	}
}

