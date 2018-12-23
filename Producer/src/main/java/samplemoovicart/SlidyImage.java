package samplemoovicart;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Moovicart.Producer.LoginWithPF;

import utility.Log;

public class SlidyImage {
	 WebDriver driver;


	@BeforeTest
	public  void openBrowser() {
		String currentDir = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", currentDir+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moovicart.com/home");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}	
	@Test(priority=0)
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		LoginWithPF log=new LoginWithPF(driver);
		log.logInUser("sakunthala", "london1234");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=1)
	public void syndicatDist(){
		driver.findElement(By.xpath("//*[@id=\"widgetLinepoint\"]/div/div/div/div[1]/a/img")).click();
		WebElement header=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div[2]/h3"));
	//	String syndicateHeader="Add Movie Details : Syndicate Distribution";
		Log.info("Successfully navigated to SyndicateDistributor Page"+header.getText());
		
		WebElement country=driver.findElement(By.id("Country"));
		Select selcountry=new Select(country);
		selcountry.selectByVisibleText("UK");
		
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
	}
	//@Test(priority=1)
//	public static void loginSuccess() {
//		LoginVerification.loginGetMessage();
//		
//	}
	
//	@Test(enabled=false)
//	public static void verifyallLinks() {
//		List<WebElement>sideSlidey=driver.findElements(By.xpath("//div[@class=\"slidey-list-thumbnail\"]"));
//		System.out.println(sideSlidey.size());
//		if(sideSlidey.size()<=6) {
//			System.out.println("Total images in slidy are 5 they are---");
//			for(WebElement t:sideSlidey) {
//				System.out.println(t);
//				String url=t.getAttribute("style");
//				System.out.println(url);
//				
//			}
//			
//		}
//		else {
//			System.out.println("TestFails");
//		}
//	}
//		
	
//	public static void verifyURLStatus(String URL) throws ClientProtocolException, IOException
//	{
//		HttpClient client=HttpClientBuilder.create().build();
//		HttpGet request=new HttpGet(URL);
//		HttpResponse response=client.execute(request);
//	if(response.getStatusLine().getStatusCode()==200)//==200 for valid links
//		{
//			System.out.println("Name of the valid link is ="+URL);
//		System.out.println(response.getStatusLine().getStatusCode());
//		}
//	}

}
