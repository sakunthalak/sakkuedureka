package day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Testing {

	
		ChromeDriver	chrome;
		String	url="https://www.edureka.co/";
		
		public void InvokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Poornesh\\Selenium\\WorkSpace\\libs\\chromedriver.exe");
			
			chrome= new ChromeDriver();
			
			chrome.manage().window().maximize();
			chrome.get(url);
		}
		public  void Search() {
			WebElement Byid=chrome.findElementById("homeSearchBar");
			if (Byid!=null)
			
			 System.out.println("The element with ID is found");
			
			else 
				System.out.println("The element with ID is not found");
			
			WebElement Byname=chrome.findElementByName("user_v1[query]");
			
			if(Byname!=null)
				System.out.println("The element with name is found");
			else
				System.out.println("The element with Name is not fount");
			WebElement Byclass=chrome.findElementByClassName("search_input");
			if (Byclass!=null)
				System.out.println("The element with Class is found");
			else
				System.out.println("The element with class is not found");
			WebElement ByXpath=chrome.findElementByXPath("//input[@id='homeSearchBar']");
				if(ByXpath!=null)
					System.out.println("The element with Xpath is found");
				else
					System.out.println("The element with Xpath is not found");
		WebElement css=chrome.findElementByCssSelector("#homeSearchBar");
		if(css!=null)
			System.out.println("The Element found with CSS locater");
		else
			System.out.println("The Element not found with CSS locater");
		
		}
	}