package appModule;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Moovicart.Producer.Base;
import com.Moovicart.Producer.ProducerDashboard;

import utility.Log;




public class Produser_SyndicateDis extends Base {
static WebDriver driver=Base.getDriver();
	
	
	
	public static void Execute() throws Exception {
		ProducerDashboard PD=new ProducerDashboard(driver);
		
		PD.PDash_SynDis().click();
		WebElement Countrylist=driver.findElement(By.className("form-control"));
		Select DisCountry=new Select(Countrylist);
		
		DisCountry.selectByValue("UK");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#generaldistribution > div > div.panel-body.container-fluid > form > div.form-group.form-material.floating > button")).click();
		
		WebElement SendsPageHeader=driver.findElement(By.xpath("//*[@id=\"step1\"]/div/h3/span[1]"));
		System.out.println(SendsPageHeader.getText());
		
		WebElement Category=driver.findElement(By.id("Category"));
		Select selCategory=new Select(Category);
		selCategory.selectByVisibleText("Short Films");
		
		WebElement Language=driver.findElement(By.id("Language"));
		Select selLanguage=new Select(Language);
		selLanguage.selectByVisibleText("Telugu");
		
		WebElement General=driver.findElement(By.id("Genre"));
		Select selGeneral=new Select(General);
		selGeneral.selectByVisibleText("Drama");
		
		driver.findElement(By.id("Duration")).sendKeys("135:31");
		driver.findElement(By.id("Certification")).sendKeys("VIL/VV/2/87/2014");
		driver.findElement(By.id("releaseDate")).sendKeys("26/12/2018");
		
		WebElement status=driver.findElement(By.id("Status"));
		Select selectStatus=new Select(status);
		selectStatus.selectByVisibleText("Ready For Release");
		
		driver.findElement(By.id("movierating")).isSelected();
		driver.findElement(By.id("licenseDuration")).sendKeys("fjsdlfkljcsdl");
		
		driver.findElement(By.name("generalInformation_add")).click();
		
		///nextpage
		WebElement Moviedetailstitle=driver.findElement(By.xpath("//*[@id=\"step2\"]/div/h3/span"));
		Log.info("Movie Details Page"+Moviedetailstitle.getText());
		
		driver.findElement(By.id("Title")).sendKeys("Robo 3.0");
		driver.findElement(By.id("Director")).sendKeys("Maniratnam");
		driver.findElement(By.id("Actors")).sendKeys("chiru,mahesh,radha,shanti");
		driver.findElement(By.id("musicDirector")).sendKeys("AR.Rehman");
		driver.findElement(By.id("Cinematographer")).sendKeys("fldkkll");
		driver.findElement(By.id("Synopsis")).sendKeys("kfjslfjds");
		driver.findElement(By.name("movieDetails_update")).click();
		
		///next Page Posters
		WebElement posters=driver.findElement(By.xpath("//*[@id=\"step3\"]/div/h3/span"));
		Log.info("Upload Movie Posters"+posters.getText());
		
		WebElement image=driver.findElement(By.id("uploadImage"));
		Select selectimagetype=new Select(image);
		selectimagetype.selectByVisibleText("Movie Poster/s");
		
		//use sikuli to upload image
		
driver.findElement(By.xpath("//*[@id=\"step3\"]/div/div/form/div[4]/a[2]")).click();

WebElement upload=driver.findElement(By.id("uploadVideosEvent"));
Select selectuploadType=new Select(upload);
selectuploadType.selectByVisibleText("Trailer/s");

	//youtubelink
driver.findElement(By.id("videoUrl")).sendKeys("https://www.youtube.com/watch?v=RysglUFIj08");
driver.findElement(By.xpath("//*[@id=\"step4\"]/div/div/form/div[3]/a[2]")).click();
//nexpage

WebElement licencePage=driver.findElement(By.xpath("//*[@id=\"step6\"]/div/h3/span"));
Log.info("Movie Licence"+licencePage.getText());

driver.findElement(By.id("pmgPerShow")).sendKeys("400");
driver.findElement(By.id("pmgPerScreen")).sendKeys("1550");
driver.findElement(By.id("netProfitShare")).sendKeys("5%");
driver.findElement(By.xpath("//*[@id=\"step6\"]/div/div/form/div[4]/button/img")).click();


//NextPage
WebElement cart=driver.findElement(By.xpath("//*[@id=\"widgetLinepoint\"]/div/h3"));
Log.info("My cart page"+cart);

//driver.findElement(By.name("checkout")).click();
		Log.info("Test Success");
		String MainWindow=driver.getWindowHandle();	
	Set<String> Noofwindows=driver.getWindowHandles();
	
	 Iterator<String> i1=Noofwindows.iterator();
	 while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
         {    		
              
                 // Switching to Child window
                 driver.switchTo().window(ChildWindow);	
                 Thread.sleep(3000);
                 driver.findElement(By.id("cc")).sendKeys("32156421213");
                          
			// Closing the Child Window.
                   //  driver.close();		
         }		
     }	
	// Switching to Parent window i.e Main Window.
     driver.switchTo().window(MainWindow);
     
driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form[1]/div/div[2]/input[1]")).click();
	 
	 
	}
		
		
		
		
		
	}
	
	


