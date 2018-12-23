package com.Moovicart.Producer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Log;

public class ProducerDashboard {
	
static WebDriver driver;
	
	public ProducerDashboard(WebDriver driver) {
		ProducerDashboard.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"ul_top_hypers\"]/li/a")
	private WebElement Logout;
	
	
	public  void dash_logout() {
		
			try {
				String string=Logout.getText();
				Log.info("LogOut button is found "+string);
			} catch (Exception e) {
				
				Log.error("Logout button is not found");
				e.printStackTrace();
			}
				
	}
	
	@FindBy(linkText="Hi, sakunthala")
	private WebElement UserName;
	public void PD_UserName() {
		try {
			String string=UserName.getText();
			Log.info("User name found on DashBoard"+string);
		} catch (Exception e) {
			
			Log.error("UserName not found on DashBoard");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//*[@id=\"widgetLinepoint\"]/div/div/div/div[1]/a/img")
	private  WebElement SyndicateDistribution;
	public  WebElement  PDash_SynDis() {
		WebElement string=null;
		try {
			 string=SyndicateDistribution;
			Log.info("SyndicateDistribution is found");
		} catch (Exception e) {
			
			Log.error("SyndicateDistribution is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	
	@FindBy(xpath="//*[@id=\"widgetLinepoint\"]/div/div/div/div[2]/a/img")
	private WebElement OutRightDistribution;
	public WebElement  PDash_OutRgihtDis() {
		WebElement string=null;
		try {
			 string=OutRightDistribution;
			Log.info("OutRightDistribution is found");
		} catch (Exception e) {
			
			Log.error("OutRightDistribution is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	
	@FindBy(xpath="//*[@id=\"widgetLinepoint\"]/div/div/div/div[3]/a/img")
	private WebElement MovieMarketing;
	public WebElement  PDash_MovieMarkt() {
		WebElement string=null;
		try {
			 string=MovieMarketing;
			Log.info("MovieMarketing is found");
		} catch (Exception e) {
			
			Log.error("MovieMarketing is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	@FindBy(xpath="//*[@id=\"widgetLinepoint\"]/div/div/div/div[4]/a/img")
	private WebElement MovieRelease;
	public WebElement  PDash_MovieRelease() {
		WebElement string=null;
		try {
			 string=MovieRelease;
			Log.info("MovieRelease is found");
		} catch (Exception e) {
			
			Log.error("MovieRelease is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[1]/a")
	private WebElement DashBoard;
	public WebElement  PDash_MyDashBoard() {
		WebElement string=null;
		try {
			 string=DashBoard;
			Log.info("DashBoard is found");
		} catch (Exception e) {
			
			Log.error("DashBoard is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[2]/a")
	private WebElement MyMovieList;
	public WebElement  PDash_MyMovieList() {
		WebElement string=null;
		try {
			 string=MyMovieList;
			Log.info("MyMovieList is found");
		} catch (Exception e) {
			
			Log.error("MyMovieList is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[3]/a")
	private WebElement DistributorPurchase;
	public WebElement  PDash_DistriPurchase() {
		WebElement string=null;
		try {
			 string=DistributorPurchase;
			Log.info("DistributorPurchase is found");
		} catch (Exception e) {
			
			Log.error("DistributorPurchase is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[4]/a")
	private WebElement DisBidding;
	public WebElement  PDash_DistriBidding() {
		WebElement string=null;
		try {
			 string=DisBidding;
			Log.info("DisBidding is found");
		} catch (Exception e) {
			
			Log.error("DisBidding is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[5]/a")
	private WebElement Myprofile;
	public WebElement  PDash_MyProfile() {
		WebElement string=null;
		try {
			 string=Myprofile;
			Log.info("Myprofile is found");
		} catch (Exception e) {
			
			Log.error("Myprofile is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[6]/a")
	private WebElement HowitWorks;
	public WebElement  PDash_HowitWorks() {
		WebElement string=null;
		try {
			 string=HowitWorks;
			Log.info("HowitWorks is found");
		} catch (Exception e) {
			
			Log.error("HowitWorks is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[7]/a")
	private WebElement Trade_Dis;
	public WebElement  PDash_TradeDistributor() {
		WebElement string=null;
		try {
			 string=Trade_Dis;
			Log.info("Trade_Dis is found");
		} catch (Exception e) {
			
			Log.error("Trade_Dis is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[8]/a")
	private WebElement Benifits;
	public WebElement  PDash_Benifits() {
		WebElement string=null;
		try {
			 string=Benifits;
			Log.info("Benifits is found");
		} catch (Exception e) {
			
			Log.error("Benifits is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[9]/a")
	private WebElement Instructions;
	public WebElement  PDash_Instructions() {
		WebElement string=null;
		try {
			 string=Instructions;
			Log.info("Instructions is found");
		} catch (Exception e) {
			Log.error("Instructions is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[10]/a")
	private WebElement TradingFAQ;
	public WebElement  PDash_TradingFAQ() {
		WebElement string=null;
		try {
			 string=TradingFAQ;
			Log.info("TradingFAQ is found");
		} catch (Exception e) {
			
			Log.error("TradingFAQ is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[11]/a")
	private WebElement Terms;
	public WebElement  PDash_TermsandCondi() {
		WebElement string=null;
		try {
			 string=Terms;
			Log.info("TermsandConditons is found");
		} catch (Exception e) {
			
			Log.error("TermsandConditons is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	@FindBy(xpath="//div[@class=\"profile-sideMenu\"]//li[12]/a")
	private WebElement Help;
	public WebElement  PDash_Help() {
		WebElement string=null;
		try {
			 string=Help;
			Log.info("Help is found");
		} catch (Exception e) {
			
			Log.error("Help is not found");
			e.printStackTrace();
		}
		return string;
		
	}
	
	
}
